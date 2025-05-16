class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int start = 0;
        int end = matrix.length - 1;

        if(end == 0){
            return targetSearch(matrix[0], target);
        }

        if(target<=matrix[0][0] && matrix[0][0] != target){
            return false;
        }

        for(int i=0; i<=end; i++){
            if(target<matrix[i][0]){
                start = i-1;
                break;
            }else if(matrix[i][0]<=target){
                start = i;
            }
        }

        return targetSearch(matrix[start], target);
    }

    public boolean targetSearch(int[] array, int target){
        for(int i = 0; i<=array.length-1; i++){
            if(array[i] == target){
                return true;
            }
        }
        return false;
    }
}