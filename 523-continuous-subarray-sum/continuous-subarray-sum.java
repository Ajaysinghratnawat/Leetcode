class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int ans = sum%k;
            if(mp.containsKey(ans)){
                int b=mp.get(ans);
                if(i-b>=2){
                    return true;
                }
            }
            else{
                mp.put(ans,i);
            }
        }
        return false;
    }
}