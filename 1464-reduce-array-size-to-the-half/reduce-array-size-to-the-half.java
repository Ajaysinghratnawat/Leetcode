class Solution {
    public int minSetSize(int[] arr) {
        int n= arr.length;
        // Map<Integer,Integer> mp = new HashMap<>();
        // for(int i=0;i<arr.length;i++){
        //     mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        // }
        int f[] = new int[1000001];
        for(int i:arr){
            f[i]++;
        }
        Arrays.sort(f);
        int count=0;
        int sum=0;
        for(int i=f.length-1;i>=0;i--){
            sum+=f[i];
            count++;
            if(sum>=n/2){
                break;
            }
        }
        
        return count;
    }
}