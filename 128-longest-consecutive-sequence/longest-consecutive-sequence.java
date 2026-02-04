class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        if(nums.length==0) return 0;
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        int ans=1;
        for(int s : st){
            int temp = s;
            if(!st.contains(temp-1)){
                int count=1;
                while(st.contains(temp+1)){
                    temp++;
                    count++;
                }
                ans = Math.max(ans,count);
            }
        }
        return ans;
    }
}