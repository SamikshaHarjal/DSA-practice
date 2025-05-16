class Solution {
    public boolean isHappy(int n) {
        return sq(n);
    }
   public boolean sq(int n){
if(n<10){
    if(n==1 ||n==7){
return true;
}
else{
    return false;
}
}
int sum=0;
while(n>0){
    sum+=(n%10) * (n%10);
    n/=10;
}
return sq(sum);
   }
}