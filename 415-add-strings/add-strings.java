class Solution {
    public String addStrings(String num1, String num2) {
        String t="";
		int carry=0;
		char ch1='0';
		char ch2='0';
		int i=num1.length()-1;
		int j=num2.length()-1;
		while(i>=0||j>=0) {
			if(i>=0) {
				ch1=num1.charAt(i);
			}
            else{
                ch1='0';
            }
			if(j>=0) {
				ch2=num2.charAt(j);
			}
            else{
                ch2='0';
            }
			int i1 = ch1-'0';
			int i2=ch2-'0';
			int ans = i1+i2+carry;
			if(ans>9) {
				t=(char)(ans%10+'0')+t;
				carry=ans/10;
			}
			else {
				t=(char)(ans+'0')+t;
				carry=0;
			}
            ch1=0;
            ch2=0;
			i--;
			j--;
		}
        if(carry>0){
            t=carry+t;
        }
		return t;
    }
}