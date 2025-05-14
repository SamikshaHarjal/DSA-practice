class Solution {
    public int[] plusOne(int[] digits) {
        int x=digits.length-1;
        for(int i=x;i>-1;i--){
       if(digits[i]<9){
        digits[i]++;
        return digits;
       }
       
       digits[i]=0;
    }
         digits=new int [x+2];
digits[0]=1;
return digits;
       

    }}