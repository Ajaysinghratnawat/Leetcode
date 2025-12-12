class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        int count=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                ans=nums[i];
                count++;
            }
        }
        return ans;
    }
}