class Solution {
    public int maxSubArray(int[] nums) {
        //to store sum 
        int ans = Integer.MIN_VALUE;
		int n = nums.length;
        //prefix array
		int[] p = new int[n];
        //prefix sum logic
		p[0] = nums[0];
		for(int i=1;i<n;i++) {
			p[i]=p[i-1]+nums[i];
		}
        //sirf negative check karna hai
		int min=0;
        //for check the sum of sub array
		for(int i=0;i<n;i++) {
			int curr = p[i];
			ans = Math.max(ans, curr-min);
			min = Math.min(min, p[i]);
		}
        return ans;
    }
}