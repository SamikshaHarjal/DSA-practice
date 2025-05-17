class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int balance=0;
        for(int i=0;i<s.length();i++){      
if(s.charAt(i)=='R'){
    count++;
}
else if(s.charAt(i)=='L'){
    count--;
}
if(count==0){
    balance++;
}           
        }
        return balance;
    }
}