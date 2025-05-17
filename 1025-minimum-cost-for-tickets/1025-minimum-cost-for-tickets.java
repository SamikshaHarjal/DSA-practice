class Solution {
    public int mincostTickets(int[] days, int[] cost) {
        int n=days.length;
        int []dp=new int [366];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;int j=0;
        for(int i=1;i<=365;i++){
            if(j<n && i==days[j]){
                dp[i]=Math.min(dp[i],dp[i-1]+cost[0]);//compute cost of day 1 pass
                if(i>=7){
                    dp[i]=Math.min(dp[i],dp[i-7]+cost[1]);//compute cost of day 7 pass
                }
                else{
                    dp[i]=Math.min(dp[i],cost[1]);
                }
                if(i>=30){
                    dp[i]=Math.min(dp[i],dp[i-30]+cost[2]);//compute cost of day 30 pass
                }
                else{
                    dp[i]=Math.min(dp[i],cost[2]);
                }
                j++;
        
            }
            else{
                dp[i]=dp[i-1];//if(not day)then->>> branch
            }
        }
        return dp[365];
    }
}