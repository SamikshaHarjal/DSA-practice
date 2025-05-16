class Solution {
    public int calculate(String s) {
        int res=0;
        int last=0;
        int num=0;
        char op='+';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num=num*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
            }
            if((!Character.isDigit(ch) && ch!=' ')|| i==s.length()-1){
                if(op=='-'){
                    res+=last;
                    last=-num;
                }
                else if(op=='+'){
                    res+=last;
                    last=num;
                }
                else if(op=='/'){
                    last/=num;
                }
                else if(op=='*'){
                    last*=num;
                }
                num=0;
                op=ch;
            }
        }
        res+=last;
        return res;
    }
}