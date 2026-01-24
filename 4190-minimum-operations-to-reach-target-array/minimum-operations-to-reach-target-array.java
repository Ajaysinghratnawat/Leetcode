class Solution {
    public int minOperations(int[] nums, int[] target) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != target[i]) {
                ans.add(nums[i]);
            }
        }
        return ans.size();
    }
}