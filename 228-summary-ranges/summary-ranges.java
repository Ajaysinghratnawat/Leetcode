class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length==0) return ans;
        int k=nums[0];
        int indx=0;
        for(int i=1;i<nums.length;i++){
            if(k+1!=nums[i]){
                if(nums[indx]==nums[i-1]){
                    ans.add(nums[indx]+"");
                }
                else{
                    ans.add(nums[indx]+"->"+nums[i-1]);
                }
                k=nums[i];
                indx=i;
            }
            else{
                k++;
            }
        }
        int end=nums.length-1;
        if(nums[indx]==nums[end]){
            ans.add(nums[indx]+"");
        }
        else{
            ans.add(nums[indx]+"->"+nums[end]);
        }
        return ans;
    }
}