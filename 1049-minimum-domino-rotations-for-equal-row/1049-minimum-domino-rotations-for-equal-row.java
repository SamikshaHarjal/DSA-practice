class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n=tops.length,res=Integer.MAX_VALUE;
        int []face=new int[7];
        for(int i=0;i<n;i++){
            face[tops[i]]++;
            if(bottoms[i]!=tops[i]){
                face[bottoms[i]]++;
            }
        }
        for(int x=1;x<=6;x++){
            if(face[x]<n){
                continue;
            }
            int mtop=0,mbottom=0;
         
            for(int i=0;i<n;i++){
                if(tops[i]!=x){
                    mtop++;
                }
                if(bottoms[i]!=x){
                    mbottom++;
                }
            }
         res=Math.min(res,Math.min(mtop,mbottom));
        }
        if(res==Integer.MAX_VALUE){
            return -1;
        }
        return res;
            }
}