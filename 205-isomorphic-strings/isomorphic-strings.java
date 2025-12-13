class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> ans = new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
                char ch1= s.charAt(i);
                char ch2= t.charAt(i);
                
                if(ans.containsKey(ch1)){
                
                    if(ans.get(ch1)!=ch2) return false;
                }
                else if(ans.containsValue(ch2)){
                    return false;
                }
                
                        ans.put(ch1,ch2);
                    
            }
        return true;


        // if(s.length()!=t.length()) return false;
        // HashMap<Character, Character> ans = new HashMap<>();
        // for(char ch='a';ch<='z';ch++){
        //     List<Integer> l = new ArrayList<>();
        //     for(int i=0;i<s.length();i++){
        //         if(ch==s.charAt(i)){
        //             l.add(i);
        //         }
        //     }
        //     char c='.';
        //     for(int i=0;i<l.size();i++){
        //         int ind=l.get(i);
        //         if(c=='.')
        //             c=t.charAt(ind);
        //         else
        //         {
        //             if(c!=t.charAt(ind))
        //                 return false;
        //         }
        //     }
        // }
        // return true;
    }
}