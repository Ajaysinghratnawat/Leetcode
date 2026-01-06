class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        int ans=0;
        if(s.length==0||g.length==0)return 0;
        for(int i=0;i<g.length;){
            int child=g[i];
            if(s[j]>=g[i]){
                ans++;
                i++;
            }
            j++;
            if(j==s.length)break;
        }
        return ans;
    }
}