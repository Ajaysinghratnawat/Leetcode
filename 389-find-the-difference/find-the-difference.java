class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            freq[t.charAt(i) - 'a']--;
            if (freq[t.charAt(i) - 'a'] < 0) {
                return t.charAt(i);
            }
        }

        return ' '; 
    }
}



// class Solution {
//     public char findTheDifference(String s, String t) {
//         char[] s1=s.toCharArray();
//         char[] t1=t.toCharArray();
//         boolean check = false;
//         char val=t1[0];
//         for(int i=0;i<t1.length;i++){
//             for(int j=0;j<s1.length;j++){
//                 if(t1[i]==s1[j]){
//                     check=true;
//                 }
//             }
//             if(check==false){
//                 val=t1[i];
//             }
//             check=false;
//         }
//         return val;
//     }
// }