class Solution {
    public int minimumCost(int[] nums) {
        int start = nums[0];
        Arrays.sort(nums,1,nums.length);
        return start+nums[1]+nums[2];
    }
}