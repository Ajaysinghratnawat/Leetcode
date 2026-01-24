class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) nums[i]=-1;
        }
        int sum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if (sum == 0) {
                count = i+1;
            } else if (mp.containsKey(sum)) {
                count = Math.max(count, i - mp.get(sum));
            } else {
                mp.put(sum, i);
            }
        }
        return count;
    }
}