class Solution {
    public String multiply(String num1, String num2) {
        int n=num1.length();
        int m=num2.length();
        int[] res=new int[m+n];
        if(num1.charAt(0)=='0'||num2.charAt(0)=='0')
            return "0";
        for(int i=0;i<n+m;i++){
            res[i]=0;
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                int p1=i+j;
                int p2=i+j+1;
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int val =mul+res[p2];
                int add=val%10;
                int carry=val/10;
                res[p2]=add;
                res[p1]+=carry;
            }
        }
        String result="";
        for(int i=0;i<res.length;i++){
            if(result.length()==0 && res[i]==0)
                continue;
            char ch = (char)('0'+res[i]);
            result+=ch;
        }
        return result;
    }
}