class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> mp = new HashMap<>();
        mp.put(')','(');
        mp.put('}','{');
        mp.put(']','[');
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('||ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                char cb=mp.get(ch);
                if(!st.isEmpty()&&cb==st.peek()){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(st.size()>0){
            return false;
        }
        return true;
    }
}