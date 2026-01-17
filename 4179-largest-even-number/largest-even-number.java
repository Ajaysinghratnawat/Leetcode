class Solution {
    public String largestEven(String s) {
        int n=s.length();
        int index=-1;
        for(int i=n-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='2'){
                index=i;
                break;
            }
        }
        System.out.println(index);
        String ans="";
        if(index==-1) return "";
        else{
            for(int i=0;i<=index;i++){
                ans+=s.charAt(i);
            }
            return ans;
        }
    }
}