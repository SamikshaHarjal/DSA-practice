class Solution {
    String[]morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public int uniqueMorseRepresentations(String[] words) {
     Set<String>set=new HashSet<>();
     for(String s:words){
       String ss="";
       for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        ss+=morse[c-'a'];
       }
       set.add(ss);
     } 
     return set.size(); 
    }
}