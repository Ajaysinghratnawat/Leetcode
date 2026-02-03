// class Solution {
//     public boolean isTrionic(int[] nums) {
//         if(nums.length <4) return false;
//         int p=-1;
//         int q=-1;
//         for(int i=0;i<nums.length;i++){
//             if((i+1)<nums.length-1 && nums[i]<nums[i+1]) {
//                 if(p==-1) p=i;
//                 else return false;
//             }
//             else{
//                 if(q==-1) q=i;
//                 else return false;
//             }
//             if(p!=-1&&q!=-1 && i==nums.length-1){
//                 return true;
//             }
//             System.out.println(p+" "+q);
//         }
//         return false;
//     }
// }


class Solution {
    public boolean isTrionic(int[] nums) {
        int i=1;
        while(i<nums.length && nums[i] > nums[i-1]){
            i++;
        }
        if(i==1 || i==nums.length){
            return false;
        }
        while(i<nums.length && nums[i] < nums[i-1]){
            i++;
        }
        if(i==nums.length){
            return false;
        }
        while(i<nums.length && nums[i] > nums[i-1]) {
            i++;
        }
        if(i==nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}