class Solution {
    public int minPairSum(int[] nums) {
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(max<nums[i]) max=nums[i];
        //     if(min>nums[i]) min=nums[i];
        // }
        // System.out.println(max);
        // System.out.println(min);
        // return max+min;

        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int sum=0;
        while(start<end){
            int total=0;
            total=nums[start]+nums[end];
            if(sum<total) sum=total;
            start++;
            end--;
        }
        return sum;
    }
}