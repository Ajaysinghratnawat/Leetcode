class Solution {
    public int minimumPrefixLength(int[] nums) {
      int count=nums.length-1;
      while(count>0&&nums[count-1]<nums[count]){
        count--;
      }
      return count;
    }
}