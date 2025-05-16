class Solution {
    public String reverseStr(String s, int k) {
        char[] r = s.toCharArray();
        int n = s.length();
        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k - 1, n - 1);
            rev(r, i, end);
        }
        return new String(r);
    }
    public static void rev(char[] r, int start, int end) {
        while (start < end) {
            char temp = r[start];
            r[start] = r[end];
            r[end] = temp;
            start++;
            end--;
        }
        return;
    }
}