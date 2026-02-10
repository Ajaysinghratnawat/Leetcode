// class Solution {
//     public int longestBalanced(int[] nums) {
//         int ans = nums.length;
//         int even=0;
//         int odd=0;
//         TreeSet<Integer> t = new TreeSet<>();
//         for(int i=0;i<nums.length;i++){
//             t.add(nums[i]);
//         }
//         for(int i:t){
//             System.out.println(i);
//         }
//         for(int i:t){
//             if(i%2==0){
//                 even++;
//             }
//             else{
//                 odd++;
//             }
//         }
//         if(even==odd) return ans;
//         else if(even<odd){
//             return even;
//         }
//         else if(even>odd){
//             return odd;
//         }
//         if(ans==2 && even!=odd) return 0;
//         return --ans;
//     }
// }


class Solution {
    public int longestBalanced(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();

            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0)
                    even.add(nums[j]);
                else
                    odd.add(nums[j]);

                if (even.size() == odd.size()) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}