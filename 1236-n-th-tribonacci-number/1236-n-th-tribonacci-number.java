class Solution {
    public int tribonacci(int n) {
        int t0=0;
        int t1=1;
        int t2=1;
        int sum=0;
        if(n==1||n==2){
            return 1;
        }
        for(int i=3;i<=n;i++){
            sum=t2+t1+t0;
int temp=0;
temp=t1;
t1=t2;
t2=sum;
t0=temp;

        }
        return sum;

    }
}