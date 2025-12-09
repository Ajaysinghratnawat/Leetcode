class Solution {
    public int lengthOfLastWord(String s) {
        String arr[] = s.split(" ");
        String s2 = arr[arr.length-1];
        return s2.length();
    }
}