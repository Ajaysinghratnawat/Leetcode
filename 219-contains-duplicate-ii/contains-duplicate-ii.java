class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            
            if(m.containsKey(nums[i])){
                if(i-m.get(nums[i])<=k){
                    return true;
                }
            }

            m.put(nums[i],i);
        }
        return false;





        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             if(Math.abs(i-j)<=k){
        //                 return true;
        //             }
        //         }
        //     }
        // }
        // return false;



    }
}