class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int []parent=new int[n+1];
        for(int i=1;i<=n;i++){//intiialize each node as its own parent
            parent[i]=i;
        }
        int []res={0,0};
        for(int []edge:edges){
int e1=find(parent,edge[0]);//find root of the first node
int e2=find(parent,edge[1]);//fint root of the 2nd node
if(e1==e2){
    res=edge;//if edge is redundant
}
else{
    parent[e2]=e1;//union connect e1 and e2
}
        }
        return res;
    }
    public int find(int []parent,int node){//union find path compression
        while(parent[node]!=node){
            parent[node]=parent[parent[node]];//Path compression
            node=parent[node];
        }
        return node;
    }
}