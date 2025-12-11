class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if (!map.containsKey(sortedWord))
                map.put(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
// class Solution {
//     public boolean isanagram(String curr,String next){
//         char[] a = curr.toCharArray();
//         char[] b = next.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);
//         return Arrays.equals(a,b);
//     }
//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> ans = new ArrayList();
//         boolean vis[] = new boolean[strs.length];
        
//         for(int i=0;i<vis.length;i++){
//             vis[i]=false;
//         }
//         for(int i=0;i<strs.length;i++){
//             String curr = strs[i];
//             List<String> anagram = new ArrayList();
//             anagram.add(curr);
//             if(vis[i]==true) continue;
//             for(int j=i+1;j<strs.length;j++){
//                 if(vis[j]==false&&isanagram(curr,strs[j])){
//                     anagram.add(next);
//                 }
//             }
//             if(anagram.size>0){
//                 ans.add(anagram);
//             }
//         }
//         ans.add(anagram);
//         anagram = new ArrayList();
//         return ans;
//     }
// }



//     public List<List<String>> groupAnagrams(String[] strs) {
//         List<List<String>> result = new ArrayList<>();
//         Map<String, List<String>> groups = new HashMap<>();

//         for (String s : strs) {
//             groups.computeIfAbsent(getSignature(s), k -> new ArrayList<>()).add(s);
//         }

//         result.addAll(groups.values());

//         return result;
//     }
// }









// for(int i=0;i<strs.length;i++){
            // String curr = strs[i];
            // anagram.add(curr);
            // for(int j=i+1;j<strs.length;j++){
            //     String next = strs[j];
            //     if(isanagram(curr,next)){
            //         anagram.add(next);
            //     }
            // }
            // ans.add(anagram);
            // anagram = new ArrayList();  
        // }