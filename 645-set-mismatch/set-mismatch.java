class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];
        TreeSet<Integer> set = new TreeSet<>();
        for (int k : nums) {
            if (!set.contains(k)) {
                set.add(k);
            } else {
                res[0] = k;
            }
        }
        int j = 1;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(j)) {
                res[1] = j;
                break;
            }
            j++;
        }
        return res;
    }
}

// class Solution {
//     public int[] findErrorNums(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         int Actual = n * (n + 1) / 2;
//         int duplicate = 0;
//         int sum = 0;
//         int ans[] = new int[2];
//         for (int i = 0; i < n; i++) {
//             sum += nums[i];
//             if (i < n - 1 && nums[i] == nums[i + 1]) {
//                 duplicate = nums[i + 1];
//             }
//         }
//         int Unique = sum - duplicate;
//         int res = Actual - Unique;
//         ans[0] = duplicate;
//         ans[1] = res;
//         return ans;
//     }
// }