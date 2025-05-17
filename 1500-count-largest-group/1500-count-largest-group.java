class Solution {
    public int countLargestGroup(int n) {
       int []freq=new int [37];
       for(int i=1;i<=n;i++){
        int v=dSum(i);
        freq[v]++;
       }
       int max=0;
       for(int v:freq){
        if(v>max){
            max=v;
           }
       }
       int count=0;
       for(int v:freq){
        if(v==max){
            count++;
        }
       }
       return count;

    }
    public int dSum(int i){
        if(i<10){
            return i;
        }
        int sum=0;
        while(i>0){
            sum+=i%10;
            i/=10;
        }
        return sum;
    }
}