class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans="";
        int n=word1.length();
        int m=word2.length();
        int len=0;
        if(n>m){
            len=n;
        }
        else{
            len=m;
        }
        for(int i=0;i<len;i++){
            if(i<n){
                ans+=word1.charAt(i);
            }
            if(i<m){
                ans+=word2.charAt(i);
            }
        }
        return ans;
    }
}