class Solution {
    public int minDeletionSize(String[] strs) {
        int n=strs.length;
        int m=strs[0].length();
        int count=0;
        String sample=strs[0];
        for(int i=0;i<m;i++){
            char ch=sample.charAt(i);
            boolean sorted=true;
            for(int j=0;j<n-1;j++){
                if(strs[j].charAt(i)>strs[j+1].charAt(i)){
                    sorted=false;
                }
            }
            if(!sorted){
                count++;
            }
        }
        return count;
        // for(int i=0;i<strs.length;i++){
        //     boolean sorted=true;
        //     for(int j=0;j<strs[0].length();j++){
        //         if(i<strs.length-1&&strs[i].charAt(j)>strs[i+1].charAt(j)){
        //             sorted=false;
        //             break;
        //         }
        //     }
        //     if(!sorted) count++;
        // }
        // return count;
    }
}