class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        int time=0;
        while(!q.isEmpty()){
            int first = q.poll();
            tickets[first]--;
            time++;
            if(tickets[first]>0){
                q.add(first);
            }
            if(first==k&&tickets[first]==0){
                return time;
            }
        }
        return -1;
    }
}