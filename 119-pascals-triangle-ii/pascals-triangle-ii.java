class Solution {
    public List<Integer> getRow(int rowIndex) {
        // List<List<Integer>> ans = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        // ans.add(new ArrayList<>(prev));
        if (rowIndex == 0) return prev;
        prev.add(1);
        // ans.add(new ArrayList<>(prev));
        if (rowIndex == 1) return prev;
        int sz=1;
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> curr = new ArrayList<>();
            curr.add(1);
            sz = prev.size();
            for (int j = 1; j < sz; j++) {
                curr.add(prev.get(j) + prev.get(j - 1));
            }
            curr.add(1);
            // ans.add(curr);
            prev = curr;
        }
        return prev;
    }
}