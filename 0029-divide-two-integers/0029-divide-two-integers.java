class Solution {
    public int divide(int a,int b) {
    
         if (a == -2147483648 && b == -1) { //edge cases
            return 2147483647;
        }
        if(a==2147483647&&b==-1){//edge cases
            return -2147483647;
        }
           if(b==1){//edge cases
            return a;
        }
        if(b==-1){
            return -a;
        }
        if(a==0){
            return 0;
        }
        else if(a==b){
            return 1;
        }
        else if(a==-b){
            return -1;
        }
       

        long a1=Math.abs((long)a);
        long b1=Math.abs((long)b);
      
        
boolean neg=(a<0)^(b<0);
        
int count=0;
while(a1>=b1){
    if(a1>=2*b1){
        a1=a1-2*b1;
        count=count+2;
    }else{
    a1=a1-b1;
    count++;
}}
if(neg==true){
    return -count;
}
return count;

    }
}