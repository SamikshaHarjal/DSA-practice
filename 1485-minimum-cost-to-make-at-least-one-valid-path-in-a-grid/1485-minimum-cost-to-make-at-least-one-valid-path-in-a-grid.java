class Solution {
    public int minCost(int[][] grid) {
    int m=grid.length;
    int n=grid[0].length;
    int max=m*n;
    int [][]costs=new int [m][n];
int [][]dir={{0,1},{0,-1},{1,0},{-1,0}};//traversal
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        costs[i][j]=max;
    }
}
Deque<int[]>queue=new ArrayDeque<>();//double ended queue
queue.offer(new int[]{0,0,0});//[row,col,cost]
costs[0][0]=0;
while(!queue.isEmpty()){
    int []cur=queue.pollFirst();
    int x=cur[0],y=cur[1],price=cur[2],dire=grid[x][y];
    //dir
    for(int i=0;i<4;i++){
       int nx=x+dir[i][0];
                int ny=y+dir[i][1];
                if (nx<0||nx>=m||ny<0||ny>=n){
                    continue;
                }
                int newCost=(dire-1==i)?price:price+1;
                if (newCost>=costs[nx][ny]){
                    continue;
                    }
                costs[nx][ny]=newCost;
                if (dire-1==i){
                    queue.offerFirst(new int[]{nx,ny,newCost});
                } else{
                    queue.offerLast(new int[]{nx,ny,newCost});
                }
            }
        }
        return costs[m-1][n-1];
    }
}