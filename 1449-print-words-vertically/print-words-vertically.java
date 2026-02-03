class Solution {
    public List<String> printVertically(String s) {
        List<String> ls = new ArrayList<>();
        String[] temp = s.split(" ");
        int maxlen = 0;
        for(int i=0;i<temp.length;i++){
            int l = temp[i].length();
            if(maxlen<l) maxlen=l;
        }
        for(int i=0;i<maxlen;i++){
            String st = "";
            for(int j=0;j<temp.length;j++){
                if(i<temp[j].length()){
                    st+=temp[j].charAt(i);
                }
                else{
                    st+=" ";
                }
            }
            String res = st.stripTrailing();
            ls.add(res);
        }
        return ls;
    }
}






















// String[] temp = s.split(" ");
//         int len = temp.length;
        // int maxlen = 0;
        // for(int i=0;i<temp.length;i++){
        //     int l = temp[i].length();
        //     if(maxlen<l) maxlen=l;
        // }
//         String[] s = new String[len];
//         for(int i=0;i<temp.length;i++){
//             String s = "";
//             String t = temp[i];
//             if(t.length()==maxlen){
//                 s[i]=t;
//             }
//             else if(t.length()<maxlen){
//                 s = t;
//                 while(s.length()!=maxlen){
//                     s+=" ";
//                 }
//             }
//         }