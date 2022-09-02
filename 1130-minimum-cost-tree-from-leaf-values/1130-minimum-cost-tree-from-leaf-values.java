class Solution {
    public int mctFromLeafValues(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[42][42];
        for(int i=0; i<dp.length;i++) {
            Arrays.fill(dp[i], -1);
        }
        return partition(arr, 0, n-1, dp);
    }
    
    public int partition(int[] arr, int start, int end, int[][] dp) {
        if(start >= end) return 0;
        if(dp[start][end] != -1) return dp[start][end];
        int value = Integer.MAX_VALUE;
        for(int i=start; i<end; i++) {
            value = Math.min(max(arr, start, i)*max(arr, i + 1, end) + partition(arr, start, i, dp) + partition(arr, i + 1, end, dp), value);
        }
        dp[start][end] = value;
        return value;
    }
    
    public int max(int[] arr, int start, int end) {
        int value = Integer.MIN_VALUE;
        for(int i=start; i<=end; i++) {
            value = Math.max(value, arr[i]);
        }
        return value;
    }
}