class Solution {
    public void sortColors(int[] nums) {
        // int i=0;
        // int j=nums.length-1;
        // for(int k=0;k<=j;){
        //     if(nums[k]==0){
        //         int temp =nums[k];
        //         nums[i]=nums[k];
        //         nums[k]=temp;
        //         i++;
        //         k++;
        //     }
        //     else if(nums[k]==2){
        //         int temp =nums[k];
        //         nums[j]=nums[k];
        //         nums[k]=temp;
        //         j--;
        //     }
        //     else{
        //         k++;
        //     }
        // }


        int x=0;
        int y=0;
        int z=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                x++;
            }
            else if(nums[i]==1){
                y++;
            }
            else if(nums[i]==2){
                z++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(x>0){
                nums[i]=0;
                x--;
            }
            else if(y>0){
                nums[i]=1;
                y--;
            }
            else if(z>0){
                nums[i]=2;
                z--;
            }
        }
    }
}