class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                ans[k++]=nums1[i];
                i++;
            }
            else{
                ans[k++]=nums2[j];
                j++;
            }
        }
        while(i<m){
            ans[k++]=nums1[i];
            i++;
        }
        while(j<n){
            ans[k++]=nums2[j];
            j++;
        }
        for(int l=0;l<nums1.length;l++){
            nums1[l]=ans[l];
        }      

        // int count;
        // if(m>=n){
        //     count=m;
        // }
        // else{
        //     count=n;
        // }
        // int k=0;
        // int m=0;
        // for(int i=0;i<count;i++){
            

        // }

        // int index=0;
        // for(int i=0;i<count;i++){
        //     if(i<n){
        //         ans[index]=nums2[i];
        //         index++;
        //     }
        //     if(i<m){
        //         ans[index]=nums1[i];
        //         index++;
        //     }
        // }
        // Arrays.sort(ans);
        // System.out.println(ans);
    }
}