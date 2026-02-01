class Solution {
    public int minimumCost(int[] nums) {
        // int start = nums[0];
        // Arrays.sort(nums,1,nums.length);
        // return start+nums[1]+nums[2];

        int start = nums[0];
        int m = Integer.MAX_VALUE;
        int n = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < m) {
                n = m;
                m = nums[i];
            } else if (nums[i] < n) {
                n = nums[i];
            }
        }
        return start+m+n;
    }
}