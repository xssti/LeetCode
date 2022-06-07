class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int min = n+1;
        int sum = 0;
        while(left <= right && right < n){
            sum += nums[right];
            while(sum >= target) {
                min = Math.min(right -left +1, min);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return min == n+1 ?0: min;
    }
}