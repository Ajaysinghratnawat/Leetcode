class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        ans.add(new ArrayList<>(prev));
        if (numRows == 1) return ans;
        prev.add(1);
        ans.add(new ArrayList<>(prev));
        if (numRows == 2) return ans;
        for (int i = 3; i <= numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            int sz = prev.size();
            for (int j = 1; j < sz; j++) {
                curr.add(prev.get(j) + prev.get(j - 1));
            }
            curr.add(1);
            ans.add(curr);
            prev = curr;
        }
        return ans;
    }
}
