class Solution {
    public int findPeakElement(int[] nums) {
        int s = 0;
        int l = nums.length - 1;
        while (s < l) {
            int mid = (s + l) / 2;
            if (nums[mid] > nums[mid + 1]) {
                l = mid;
            } else {
                s = mid + 1;
            }
        }
        return s;        
    }
}