class Solution {
    public String reorganizeString(String s) {

        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> b[1] - a[1]
        );
        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            pq.add(new int[]{e.getKey(), e.getValue()});
        }

        StringBuilder ans = new StringBuilder();
        while (pq.size() >= 2) {
            int[] first = pq.poll();
            int[] second = pq.poll();

            ans.append((char) first[0]);
            ans.append((char) second[0]);

            first[1]--;
            second[1]--;

            if (first[1] > 0) pq.add(first);
            if (second[1] > 0) pq.add(second);
        }
        if (!pq.isEmpty()) {
            int[] last = pq.poll();
            if (last[1] > 1) return "";
            ans.append((char) last[0]);
        }

        return ans.toString();
    }
}
