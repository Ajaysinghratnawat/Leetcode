class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int min = citations[0];
        int max = citations[citations.length-1];
        for(int i=max;i>=0;i--){
            int count=0;
            for(int j=0;j<citations.length;j++){
                if(citations[j]>=i){
                    count++;
                }
            }
            if(count>=i ){
                return i;
            }
        }
        return 0;
    }
}







// public class Solution {
//     public int hIndex(int[] citations) {
//         Arrays.sort(citations);
//         int h_index = 0;
//         for (int i = citations.length - 1; i >= 0; i--) {
//             if (citations[i] > h_index)
//                 h_index++;
//             else
//                 break;
//         }
//         return h_index;
//     }
// }