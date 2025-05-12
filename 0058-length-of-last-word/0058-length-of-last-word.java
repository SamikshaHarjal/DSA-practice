class Solution {
    public int lengthOfLastWord(String s) {
        int x=s.length()-1;
        int max=0;
        int count=0;
        if(s.length()==1&& s.charAt(0)!=' '){
return 1;
        }

for(int i=x;i>-1;i--){
    char c= s.charAt(i);
    if(c!=' '){
      count++;
    }
    if(count>0 &&c==' '){
        return count;
    }
    if(count>0 &&i==0){
        return count;
    }
}return 0;
    }
}