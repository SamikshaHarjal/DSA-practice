class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int []map=new int [100];
        int count=0;
        for(int arr[]:dominoes){
         if(arr[0]>arr[1]){
            map[arr[1]*10+arr[0]]++;

         }
         else{
            map[arr[0]*10+arr[1]]++;
         }
        }
        for(int v:map){
            count+=(v-1)*v/2;
        }
        return count;
    }
}