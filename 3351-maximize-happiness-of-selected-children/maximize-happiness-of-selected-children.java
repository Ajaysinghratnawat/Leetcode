class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int n=happiness.length;
        long ans=0;
        long max=0;
        for(int i=0;i<k;i++){
            max=happiness[n-1-i]-i;
            ans+=Math.max(0,max);
        }
        return ans;
    }
}