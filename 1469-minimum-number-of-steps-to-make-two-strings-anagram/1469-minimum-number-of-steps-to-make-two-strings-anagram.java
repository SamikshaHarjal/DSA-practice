class Solution {
    public int minSteps(String s, String t) {
        int freq[]=new int[26];
        int sum=0;
        for(int i=0;i<t.length();i++){
        char c=t.charAt(i);
        freq[c-'a']++;
        }
        for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        freq[c-'a']--;
        }
        for(int v:freq){
            if(v>0){
                sum+=v;
            }
        }
        return sum;
    }
}