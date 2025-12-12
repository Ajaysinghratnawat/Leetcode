class Solution {
    public String decodeString(String s) {
        Stack<Integer> n = new Stack<>();
        Stack<String> st = new Stack<>();
        String ans = "";
        int count = 0;
        char[] ch= s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if (Character.isDigit(ch[i])){
                count = count * 10 + ch[i] - '0';
            } 
            else if (ch[i] == '[') {
                n.push(count); 
                st.push(ans); 
                count = 0; ans = "";
            }
            else if (ch[i] == ']') {
                int j = n.pop();
                String tmp = st.pop();
                while (j-- > 0) tmp += ans;
                ans = tmp;
            }
             else ans += ch[i];
        }
        return ans;
    }
}