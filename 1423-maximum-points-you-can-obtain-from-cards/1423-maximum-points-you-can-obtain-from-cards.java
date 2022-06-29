class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int len = cardPoints.length;
        int sum = 0, minSum = 0, curSum = 0;
        for(int i=0; i<len; i++) {
            sum += cardPoints[i];
            curSum += cardPoints[i];
            if (i < len-k) minSum += cardPoints[i];
            else {
                curSum -= cardPoints[i-(len-k)];
                minSum = Math.min(minSum, curSum);
            }
        }
        return sum - minSum;
    }
}
