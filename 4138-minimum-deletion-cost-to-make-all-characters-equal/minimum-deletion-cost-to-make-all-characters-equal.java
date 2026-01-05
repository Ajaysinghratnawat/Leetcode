// class Solution {
//     public long minCost(String s, int[] cost) {
//         long[] hash = new long[26];
//         char[] c = s.toCharArray();
//         long total_cost = 0 , max_cost = 0;
//         for(int i = 0; i < cost.length; i++) {
//             total_cost += cost[i];
//             hash[c[i] - 'a'] += cost[i];
//             if(hash[c[i] - 'a'] > max_cost) max_cost = hash[c[i] - 'a'];
//         }
//         return total_cost - max_cost;
//     }
// }


// class Solution {
//     public long minCost(String s, int[] cost) {
//         long max = Integer.MIN_VALUE;
//         int k=-1;
//         for(int i=0;i<cost.length;i++){
//             if(max<cost[i]){
//                 max=cost[i];
//                 k=i;
//             }
//         }
//         long sum =0;
//         for(int i=0;i<cost.length;i++){
//             sum+=cost[i];
//         }
//         long count =0;
//         for(int i=0;i<cost.length;i++){
//             if(cost[i]==max){
//                 count++;
//             }
//         }
//         int step =0;
//         long total=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(k)==s.charAt(i)){
//                 total+=cost[i];
//             }
//         }
//         total-=cost[k];
//         long ans = sum-max*(count);
//         if(step==0){
//             return ans = sum-max*(count);
//         }
//         return ans-total;
//     }
// }






class Solution {
    public long minCost(String s, int[] cost) {
      //char[] c=s.toCharArray();
    //   int sum=0;
    //   for(int i=0;i<cost.length;i++){
    //     sum+=cost[i];
    //   }
      long mini=Long.MAX_VALUE;
      for(char ch='a';ch<='z';ch++){
        long total=0;
        for(int i=0;i<s.length();i++){
            char l=s.charAt(i);
            if(ch!=l){
                total+=cost[i];
            }
        }
        mini=Math.min(mini,total);
      }
      return mini;
    }
}