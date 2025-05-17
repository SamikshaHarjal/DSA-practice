class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int z=0,n=arr1.length;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<n;j++){
                if(arr1[j]==arr2[i]){
                    int temp=arr1[z];
                    arr1[z++]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
       int []arr=new int [n-z];
       int x=0;
       for(int i=z;i<n;i++){
        arr[x++]=arr1[i];
       }
       Arrays.sort(arr);
       x=0;
       for(int i=z;i<n;i++){
        arr1[i]=arr[x++];
       }
        return arr1;
    }
}