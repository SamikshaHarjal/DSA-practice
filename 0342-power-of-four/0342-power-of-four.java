class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<1){
            return false;
        }
      int x=1;
while(x<n){
    if(n%x!=0){
        return false;
    }
    x=x*4;
}
if(x==n){
    return true;
}
return false;
    }
}