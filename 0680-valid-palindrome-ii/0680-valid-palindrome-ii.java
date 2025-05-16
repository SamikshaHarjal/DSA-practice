class Solution {
    public boolean validPalindrome(String s) {
        int mis=0;
        int mis2=0;
        int l=0,r=s.length()-1;
        while(l<=r){
            if(s.charAt(l)==s.charAt(r)){
                l++;r--;
            }
            else{
                r--;
                mis++;
            }
        }
        l=0;
        r=s.length()-1;
        while(l<=r){
              if(s.charAt(l)==s.charAt(r)){
                l++;r--;
            }
            else{
                l++;
                mis2++;
            } 
        }
     if(Math.min(mis,mis2)<2){
        return true;
     }
     return false;
    }
}