class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int n=numbers.length-1;
        while(i<n){
            int sum = numbers[i]+numbers[n];
            if(sum==target){
                return new int[]{i+1,n+1};
            }
            else if(sum<target) i++;
            else n--;
        }
        return new int[]{-1,-1};
        
        // int ans[]= new int[2];
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=i+1;j<numbers.length;j++){
        //         if(numbers[i]+numbers[j]==target){
        //             ans[0]=i+1;
        //             ans[1]=j+1;
        //         }
        //     }
        // }
        // return ans;
    }
}