class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int sum = 0, min_sum = 0, ans = 0;
        int left = 0, right = len - k;
        for(int i=0; i<len; i++) {
            sum += cardPoints[i];
        }
        if(len == k) return sum;
        for(int i=0; i<len-k-1; i++) {
            min_sum += cardPoints[i];
        }
        for(int i=len-k-1; i<len; i++){
            min_sum += cardPoints[i];
            ans = Math.max(ans, sum - min_sum);
            min_sum -= cardPoints[i -(len-k-1)];
        }
        return ans;
    }
}