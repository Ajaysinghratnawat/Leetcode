class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int ans=0;
        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int val = mp.get(ch);
            if(i+1<s.length()){
                int temp = mp.get(s.charAt(i+1));
                if(temp>val){
                    ans-=val;
                }
                else{
                    ans+=val;
                }
            }
            else{
                ans+=val;
            }
        }
        return ans;
    }
}