class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if (n==1||n==2){
            return 1;
        }
            int n1=0;
            int n2=1;
            int n3=0;
            for(int i=1;i<n;i++){
                n3=n1+n2;
                n1=n2;
                n2=n3;

            }return n3;
        
    }
}