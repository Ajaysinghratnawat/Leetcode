class Solution {
    public int minimumDeletions(String s) {
        int count=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='b'){
                count++;
            }
            else if(count>0){
                count--;
                ans++;
            }
        }
        return ans;
    }
}