class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list=new ArrayList<>();
    
int m=arr.length;
int n=arr[0].length;
        int k=0;
        int dir=0,top=0,bottom=m-1,left=0,right=n-1;
while(k<m*n){
if(dir==0){
    for(int i=left;i<=right;i++){
        list.add(arr[top][i]);


 k++;
    }
    top+=1;dir++; 
}
else if(dir==1){
    for(int i=top;i<=bottom;i++){
 list.add(arr[i][right]);
 k++;
    }
    right-=1;dir++;
}
else if(dir==2){
    for(int i=right;i>=left;i--){
        list.add(arr[bottom][i]);


 k++;
    }
    bottom-=1;dir++; 
}
else{
    for(int i=bottom;i>=top;i--){
        list.add(arr[i][left]);


 k++;
    }
    left+=1;dir=0;
}
   
}return list;
    }
}