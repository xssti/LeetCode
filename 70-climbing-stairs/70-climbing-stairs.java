class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[46];
        return getCount(n, dp);
    }
    
    public int getCount(int n, int[] dp) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(dp[n] != 0) return dp[n];
        return dp[n] = getCount(n-1, dp) + getCount(n-2, dp);
    }
}