class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int index=0;
        boolean check=false;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);
        for(int i=0;i<nums.length;i++){
            if(i==index) continue;
            if( max>=(2*nums[i])){
                System.out.println("true");
                check=true;
            }
            else{
                System.out.println("false");
                check=false;
                break;
            }
        }
        if(check){
            return index;
        }
        return -1;
    }
}