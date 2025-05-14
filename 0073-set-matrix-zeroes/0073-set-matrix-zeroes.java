class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int []arr1=new int [matrix.length];
        int []arr2=new int [matrix[0].length];
        Arrays.fill(arr1,1);
        Arrays.fill(arr2,1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
arr1[i]=0;
arr2[j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]==0||arr2[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        return;
    }
}