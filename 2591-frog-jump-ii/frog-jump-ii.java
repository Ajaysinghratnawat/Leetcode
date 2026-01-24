class Solution {
    public int maxJump(int[] stones) {
        int n=stones.length;
        if(n==2){
            return stones[n-1];
        }
        int sum=0;
        for(int i=2;i<n;i++){
            sum=Math.max(sum,stones[i]-stones[i-2]);
        }
        return sum;
    }
}