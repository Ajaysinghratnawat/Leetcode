class Solution {
    public int[] shortestToChar(String s, char c) {
        int temp = -1;
        int[] left = new int[s.length()];
        int[] right = new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==c) temp=i;
            if(temp==-1)left[i]=Integer.MAX_VALUE;
            else{
                left[i]=i-temp;
            } 
        }
        temp = s.length();
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch==c) temp=i;
            if(temp==s.length()) right[i]=Integer.MAX_VALUE;
            else{
                right[i]=temp-i;
            }
        }
        // for(int i=0;i<s.length();i++){
        //     System.out.print(right[i]+" ");
        // }
        // System.out.println();
        // for(int i=0;i<s.length();i++){
        //     System.out.print(left[i]+" ");
        // }
        int[] res = new int[s.length()];
        for(int i=0;i<s.length();i++){
            res[i]=Math.min(left[i],right[i]);
        }
        return res;












        // int n = s.length();
        // int[] ans = new int[n];
        // int prev = -n;
        // for (int i = 0; i < n; i++) {
        //     if (s.charAt(i) == c) {
        //         prev = i;
        //     }
        //     ans[i] = i - prev;
        // }
        // prev = 2 * n;
        // for (int i = n - 1; i >= 0; i--) {
        //     if (s.charAt(i) == c) {
        //         prev = i;
        //     }
        //     ans[i] = Math.min(ans[i], prev - i);
        // }
        // return ans;
    }
}
