class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2;
        int newsum=0;
        for(int i=0;i<nums.length;i++){
            newsum+=nums[i];
        }
        return sum-newsum;

        // Arrays.sort(nums);
        // if(nums[0]!=0) return 0;
        // if(nums[nums.length-1]!=nums.length) return nums.length;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return 0;
    }
}