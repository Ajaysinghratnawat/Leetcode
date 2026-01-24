class Solution {
    public int countPrimes(int n) {
        int count =0;
        if(n<=2)return 0;
        boolean[] check=new boolean[n+1];
        for(int j=2;j<=n;j++){
            check[j]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(check[i]){
                for(int j=i*i;j<=n;j+=i){
                    check[j]=false;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(check[i]) count++;
        }
        return count;
    }
}