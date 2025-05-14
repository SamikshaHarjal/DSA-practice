class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        int k=1,dir=0,left=0,right=n-1,top=0,bottom=n-1;
        while(k<=n*n){
            if(dir==0){
for(int i=left;i<=right;i++){
arr[top][i]=k;
k++;
}
top++;dir=1;
            }
            else if(dir==1){
for(int i=top;i<=bottom;i++){
    arr[i][right]=k;
    k++;
}
right--;
dir=2;
            }
            else if(dir==2){
for(int i=right;i>=left;i--){
    arr[bottom][i]=k;
    k++;
}
bottom--;
dir=3;
            }
            else{
for (int i=bottom;i>=top;i--){
    arr[i][left]=k;
    k++;
}
left++;
dir=0;

            }
        }
        return arr;
    }
}