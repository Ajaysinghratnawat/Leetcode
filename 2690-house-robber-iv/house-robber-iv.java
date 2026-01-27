class Solution {
    public int minCapability(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min) min=nums[i];
            if(nums[i]>max) max=nums[i];
        }
        int ans=0;
        int start=min;
        int end=max;
        while(start<=end){
            int mid = (start+end)/2;
            if(check(nums,k,mid)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    public boolean check(int[] nums,int k,int mid){
        int count=0;
        for(int i=0;i<nums.length;){
            if(nums[i]<=mid){
                count++;
                i+=2;
            }
            else
                i++;
        }
        if(count>=k) return true;
        else return false;
    }
}