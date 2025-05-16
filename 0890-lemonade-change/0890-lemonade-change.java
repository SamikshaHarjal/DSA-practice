class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0,ten=0;
        for(int i:bills){
            if(i==5)
            five++;
            if(i==10){
            if(five==0)
            return false;
            five--;
            ten++;
            }
            if(i==20){
                if(five==0||ten==0&&five<3)
                return false;
                if(ten>=1){
                ten--;
                five--;}
                else
                five-=3;
            }
        }
        return true;
    }
}