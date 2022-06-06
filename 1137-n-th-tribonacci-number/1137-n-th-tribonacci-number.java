class Solution {
    public int tribonacci(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        if(n==0)
            return 0;
        dp[1]=1;
        if(n==1)
            return 1;
        dp[2]=1;
        if(n<=2)
            return dp[n];
        for(int i=3;i<n+1;i++)
        {
            dp[i]=dp[i-3]+dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}