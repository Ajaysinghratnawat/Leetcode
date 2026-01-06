class Solution {
    public boolean check(int[] piles,int mid,int h){
        long speed=0;
        for(int i=0;i<piles.length;i++){
            speed+=(piles[i]+mid-1)/mid;
        }
        if(speed<=h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>end){
                end=piles[i];
            }
        }
        int ans=0;
        int speed=0;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(check(piles,mid,h)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}