class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int ans=0;
        int max = nums[0];
        for(int i =0 ;i<nums.length;i++){
            sum+=nums[i];
            max = Math.max(max,nums[i]);
        }
        int start = max;
        int end = sum;
        while(start<=end){
            int mid = start+(end-start)/2;
                if(split( mid , nums , k )  ){
                    ans = mid;
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
        }
        return ans;
    }
    boolean split(int m , int nums[] , int k ){
        int sum = 0;
        int count =0;
        for(int i= 0 ; i< nums.length ;i++){
            if(sum + nums[i] > m){
                count ++;
                sum = nums[i];
                if( k <= count ){
                    return false;
                }
            }
            else{
                sum += nums[i];
            }
        }
        return true;
    }
}