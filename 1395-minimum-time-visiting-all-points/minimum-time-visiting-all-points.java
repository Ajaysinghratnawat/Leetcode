class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;
        for(int i=0;i<points.length-1;i++){
            int l = Math.abs(points[i+1][1]-points[i][1]);
            int s= Math.abs(points[i+1][0]-points[i][0]);
            int max = Math.max(s,l);
            sum+=max;
        }
        return sum;
    }
}