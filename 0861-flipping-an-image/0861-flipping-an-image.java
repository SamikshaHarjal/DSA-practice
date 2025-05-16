class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m=image.length,n=image[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
if(image[i][j]==0){
    image[i][j]=1;
}
else{
    image[i][j]=0;
}
            }
        }
        for(int i=0;i<m;i++){int x=n-1,j=0;
            while(j<x){
int temp=image[i][j];
image[i][j]=image[i][x];
image[i][x]=temp;
j++;
x--;
            }
            
        }
        return image;
    }
}