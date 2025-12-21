class Solution {
    public int mirrorDistance(int n) {
        int rev=0;
        int newn =n;
        while(n>0){
            int m=n%10;
            rev=rev*10+m;
            n/=10;
        }
        return Math.abs(newn-rev);
    }
}