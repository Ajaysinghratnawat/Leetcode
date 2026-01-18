class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int s = 0;
        int p = 1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            p *= nums[i];
            while (p >= k) {
                p /= nums[s];
                s++;
            }
            count += (i - s + 1);
        }
        return count;
    }
}
