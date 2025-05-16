class Solution {
    private int f(int row, int col, int n_row, int n_col, int[][] dp) {
        if(row == n_row - 1 && col == n_col - 1) return 1;
        if(row >= n_row || col >= n_col) return 0;

        if(dp[row][col] != -1) return dp[row][col];
        int result = f(row + 1, col, n_row, n_col, dp) + f(row, col + 1, n_row, n_col, dp);
        dp[row][col] = result;
        return result;
    }
    
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int index = 0; index < dp.length; index ++) Arrays.fill(dp[index], -1);

        return f(0, 0, m, n, dp);
    }
}