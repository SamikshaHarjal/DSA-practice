    class Solution {
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        int [][] dp = new int[n][n+1];

        int [] suffsum = new int[n];
        suffsum[n-1] = piles[n-1];

        for(int i= n-2; i>=0; i--){
            suffsum[i] = suffsum[i+1] + piles[i];
        }

        for(int i= n-1; i>=0; i--){
            for(int m =1; m<=n; m++){
                if(i + 2*m >= n ){
                    dp[i][m] = suffsum[i];
                } 
                else {
                 for (int x = 1; x <=2*m; x++) {
    dp[i][m] = Math.max(dp[i][m], suffsum[i] - dp[i + x][Math.max(m, x)]);
               }

                }
        }
        }
        return dp[0][1];
   }
}
    