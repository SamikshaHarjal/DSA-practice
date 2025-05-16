class Solution {
    public int nthUglyNumber(int n) {
        int[] ug = new int[n];
        ug[0] = 1;
        int i2 = 0, i3 = 0, i5 = 0;
        for (int i = 1; i < n; i++) {
            int n2 = ug[i2]*2;
            int n3 = ug[i3]*3;
            int n5 = ug[i5]*5;
            int next = Math.min(n2, Math.min(n3, n5));
            ug[i] = next;
            if (next==n2) {
                i2++;
                }
            if (next==n3) {
                i3++;
                }
            if (next==n5) {
                i5++;
                }
        }
        return ug[n-1];
    }
}