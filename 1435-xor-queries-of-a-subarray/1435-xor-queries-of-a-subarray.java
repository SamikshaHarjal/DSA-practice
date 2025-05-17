class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int []a=new int[queries.length];
        int []prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]^arr[i];}
            for(int i=0;i<a.length;i++){
                int left=queries[i][0];
                int right=queries[i][1];
                if(left==0){
a[i]=prefix[right];
                }
                else{
a[i]=prefix[right]^prefix[left-1];
                }
            }
        return a;
    }
}