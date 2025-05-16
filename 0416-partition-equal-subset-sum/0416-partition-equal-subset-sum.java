class Solution {
    public boolean canPartition(int[] nums) {
        int total=0;
        for(int v:nums){
            total+=v;
        }
        if(total%2!=0){
            return false;
        }
        total/=2;
        boolean dp[]=new boolean[total+1];
        dp[0]=true;
        for(int v:nums){
            for(int i=total;i>=v;i--){
                dp[i]=dp[i]||dp[i-v];
            }
        }
        return dp[total];
    }
}