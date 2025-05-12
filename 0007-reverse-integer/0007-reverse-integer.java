class Solution {
    public int reverse(int x) {
       String s= Integer.toString(x);
       
       String r="";
       int j=0;
       if(s.charAt(0)=='-'){ 
        j=1;
        r+="-";
       }
       for (int i=s.length()-1;i>=j;i--){
r+=s.charAt(i);
       }
       long f=Long.parseLong(r);
        if (f>2147483647||f<-2147483648 ) {
                return 0; 
            }
       return (int)f;
}}