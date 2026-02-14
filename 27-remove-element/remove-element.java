class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length-1;
        for(int i=0;i<=n;){
            if(nums[i]!=val){
                i++;
            }
            else{
                int temp = nums[n];
                nums[n]=nums[i];
                nums[i]=temp;
                n--;
            }
        }
        return n+1;

        
        // int n = nums.length;
        // int j=0;
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=val) nums[j++]=nums[i];
        // }
        // return j;
    }
}

