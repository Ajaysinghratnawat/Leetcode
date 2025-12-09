class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        String s2 = arr[arr.length-1];
        return s2.length();
        // int count = 0;
        // for(int i=s.length()-1;i>=0;i--){
        //     char ch = s.charAt(i);
        //     if(ch==' '){
        //         break;
        //     }
        //     else{
        //         count++;
        //     }
        // }
        // return count;
    }
}