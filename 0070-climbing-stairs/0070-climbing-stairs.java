class Solution {
    public int climbStairs(int n) {
        int sum=0;
   int temp=2;
     if(n<4){
        return n;
     }
     
     else {
        int n1=2;
   int n2=3;
   
		        for(int i=2;i<n-1;i++){
        sum=0;
        sum=n1+n2;
        n1=n2;
        n2=sum;
        }
        return sum;
        }
     
    }
}