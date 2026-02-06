class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int maxLen = 0;
        for (int j = 0; j < nums.length; j++) {
            while ((long) nums[j] >(long)nums[i] * k) {
                i++;
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return nums.length - maxLen;
    }
}



// class Solution {
//     public boolean check(int min,int max,int k){
//         if(max<=k*min){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public int minRemoval(int[] nums, int k) {
//         int ans=0;
//         int max = Integer.MIN_VALUE;
//         int min = Integer.MAX_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>max){
//                 max=nums[i];
//             }
//             if(nums[i]<min){
//                 min=nums[i];
//             }
//         }
//         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i=0;i<nums.length;i++){
//             pq.add(nums[i]);
//         }
//         for(int i=0;i<nums.length-1;i++){
//             if(!check(min,max,k)){
//                 ans++;
//                 int temp = pq.poll();
//                 System.out.println(temp);
//                 max=pq.peek();
//             }
//             else{
//                 return ans;
//             }
//        }
//         return ans;
//     }
// }