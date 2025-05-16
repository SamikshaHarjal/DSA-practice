class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
      int v=graph.length;
      int []vis=new int [v];//check visited nodes
      int []inrec=new int [v];//nodes marked in recurssive stacks
      List<Integer>res=new ArrayList<>();
for(int i=0;i<v;i++){//run dfs
    if(vis[i]!=1){
        dfs(i,vis,inrec,graph);
    }
}
for(int i=0;i<v;i++){
    if(inrec[i]==0){//add nodes not in cycle
        res.add(i);
    }
}
return res;
    }
    public boolean dfs(int i,int[] vis,int []inrec,int[][]graph){
        vis[i]=1;//mark as visited node
        inrec[i]=1;//mark as in recurssive track;
        for(int j:graph[i]){
if(vis[j]!=1){
    if(dfs(j,vis,inrec,graph)){
        return true;//cycle detected;
    }
}
    else if(inrec[j]==1){
return true;//cycle detected
    }
        }
inrec[i]=0;//mark node as not in recurssive stack
return false;
        }
    }
