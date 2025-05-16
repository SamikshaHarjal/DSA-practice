class Solution {
    public boolean detectCapitalUse(String word) {
       if(word.equals(word.toUpperCase())||word.equals(word.toLowerCase())){
        return true;
       }
       char c=word.charAt(0);
       if(c-'A'<32){
        for(int i=1;i<word.length();i++){
            char c1=word.charAt(i);
            if(c1-'a'>=0&&c1-'a'<32){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
       }
       return false;
    }
}