import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String o = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = o.length() - 1;
        while (j > i) {
            if (o.charAt(i) != o.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}