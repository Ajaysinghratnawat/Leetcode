class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0]!=b[0]){
                return Integer.compare(a[0],b[0]);
            }
            else{return Integer.compare(a[1],b[1]);}
        });
        List<int[]> ans = new ArrayList<int[]>();
        int curr = intervals[0][1];
        ans.add(intervals[0]);
        int s=0;
        for(int i=1;i<intervals.length;i++){
            if(curr>=intervals[i][0]){
                curr=Math.max(curr,intervals[i][1]);
                ans.get(s)[1]=curr;
            }
            else{
                curr=intervals[i][1];
                ans.add(intervals[i]);
                s++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
        // int[][] arr = new int[ans.size()][2];
        // for(int i=0;i<ans.length;i++){
        //     arr[i][0] = ans[i][0];
        //     arr[i][1] = ans[i][1];
        // }
    }
}