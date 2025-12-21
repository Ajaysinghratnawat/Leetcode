class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        int n = numRows;
        String[] ans = new String[n];
        for(int i=0;i<n;i++){
            ans[i] = "";
        }
        int dir=-1;
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(count==numRows-1||count==0){
                dir*=-1;
            }
            ans[count]+=ch;
            if(dir==1){
                count++;
            }
            else{
                count--;
            }
        }
        String res="";
        for(int i=0;i<ans.length;i++){
            res+=ans[i];
        }
        return res;
    }
}