class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            char c2=s.charAt(i+1);
            sum+=Math.abs((c-'a')-(c2-'a'));
        }
        return sum;
    }
}