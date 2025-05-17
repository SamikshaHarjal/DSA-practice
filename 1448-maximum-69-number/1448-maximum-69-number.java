class Solution {
    public int maximum69Number (int num) {
        int d=num;
        int i=0;
        int place=0;
        while(d>0){
            int rem=d%10;
            i++;
            if(rem==6){
                place=i;
            }
            d/=10;
        }
        int abc=(int)Math.pow(10,place-1);
        num+=abc*3;
        return num;
    }
    }
