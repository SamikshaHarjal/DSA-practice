class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int arr[]=new int [queries.length];
     for(int i=0;i<queries.length;i++){
        int idx=queries[i][1];
        int add=queries[i][0];
        nums[idx]+=add;
        int sum=0;
        for(int v:nums){
            if(v%2==0){
sum+=v;}
        }
        arr[i]=sum;
     }   
     return arr;
    }
}