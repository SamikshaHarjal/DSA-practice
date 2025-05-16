class Solution {
    public int trapRainWater(int[][] heightMap) {
        int m=heightMap.length,n=heightMap[0].length,sum=0;
        int [][]waterLevel=new int [m][n];
for(int i=0;i<m;i++){//waterlevel height map
    for(int j=0;j<n;j++){
        if(i==0||j==0||i==m-1||j==n-1){
            waterLevel[i][j]=heightMap[i][j];
        }
        else{
            waterLevel[i][j]=Math.max(heightMap[i][j],Math.min(waterLevel[i-1][j],waterLevel[i][j-1]));
        }
    }
}
while(true){//waterlevel itteration
    boolean change=false;
    for(int i=1;i<m-1;i++){//forwardcheck
        for(int j=1;j<n-1;j++){
            int curVal=waterLevel[i][j];
          waterLevel[i][j] = Math.max(
                        heightMap[i][j],
                        Math.min(waterLevel[i][j], Math.min(waterLevel[i - 1][j], waterLevel[i][j - 1]))
                    );
            if(waterLevel[i][j]!=curVal){
                change=true;
            }
        }
    }
    for(int i=m-2;i>=1;i--){//backward check
        for(int j=n-2;j>=1;j--){
            int curVal=waterLevel[i][j];
            waterLevel[i][j] = Math.max(
                        heightMap[i][j],
                        Math.min(waterLevel[i][j], Math.min(waterLevel[i + 1][j], waterLevel[i][j + 1]))
                    );
            if(waterLevel[i][j]!=curVal){
                change=true;
            }
        }
    }
    if(!change){// if all levels are stabalized break loop
        break;
    }
}
for(int i=1;i<m-1;i++){//calculate trapped water
    for(int j=1;j<n-1;j++){
        sum+=waterLevel[i][j]-heightMap[i][j];
    }
}
return sum;
    }
}