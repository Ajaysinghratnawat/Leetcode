class Solution {
    public int thirdMax(int[] nums) {
       
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;

        // int f=Integer.MIN_VALUE;
        // int s=Integer.MIN_VALUE;
        // int t=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>f){
        //         t=s;
        //         s=f;
        //         f=nums[i];
        //     }
        //     else if(nums[i]>s && nums[i]<f){
        //         t=s;
        //         s=nums[i];
        //     }
        //     else if(nums[i]>t&& nums[i]<s){
        //         t=nums[i];
        //     }
        // }
        // if(t>=Integer.MIN_VALUE){
        // return t;
        // }
        // return f;

         // Arrays.sort(nums);
        // int count =1;
        // int max = nums[nums.length-1];
        // for(int i=nums.length-2;i>=0;i--){
        //     if(nums[i]!=nums[i+1]){
        //         count++;
        //         if(count==3){
        //             max=nums[i];
        //         }
        //     }
        // }
        // return max;
    }
}