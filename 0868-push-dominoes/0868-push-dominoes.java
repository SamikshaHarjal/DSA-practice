class Solution {
    public String pushDominoes(String s) {
        String res = "";
        int prev = 0;
        s = "L" + s + "R";
        for (int curr = 1; curr < s.length(); curr++) {
            if (s.charAt(curr) == '.') {
                continue;
                }
            int span = curr - prev - 1;
            if (prev > 0){
                res += s.charAt(prev);
            }
            if (s.charAt(prev) == s.charAt(curr)) {
                for (int i = 0; i < span; i++){
                    res += s.charAt(prev);
                }
            } else if (s.charAt(prev) == 'L' && s.charAt(curr) == 'R') {
                for (int i = 0; i < span;i++)
                    res += '.';
            } else {
                for (int i = 0; i < span / 2;i++)
                    res += 'R';
                if (span % 2 == 1){
                    res += '.';
                }
                for (int i = 0; i < span / 2;i++){
                    res += 'L';
                }
            }
            prev = curr;
        }
        return res;
    }
}
