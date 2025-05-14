class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int k=-1;
        for(int i=0;i<matrix.length;i++){
           if (matrix[i][0]<=target && target <=matrix[i][matrix[0].length-1]){
            k=i;
            break;
           }
           
        }
        if(k<0){
            return false;
        }
        for(int x=0;x<matrix[0].length;x++){
            if(matrix[k][x]==target){
                return true;
            }
        }
        return false;

    }
}