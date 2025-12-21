class Solution {
    public int arrangeCoins(int n) {
        long s=0;
        long e=n;
        long  ans=0;
        long mid=0;
        while(s<=e){
            mid = s+(e-s)/2;
            if((mid*(mid+1))/2 <= n){
                ans=mid;
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return (int)ans;
        // int row=0;
        // for(int i=1;;i++){
        //     n-=i;
        //     if(n<0){
        //         break;
        //     }
        //     row++;
        // }
        // return row;
    }
}