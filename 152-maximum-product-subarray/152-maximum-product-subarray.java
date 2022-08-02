class Solution {
    public int maxProduct(int[] nums) {
        int curMax = nums[0];
        int curMin = nums[0];
        int max = nums[0];
        for(int i=1; i<nums.length; i++) {
            int temp = curMax;
            curMax = Math.max(nums[i], Math.max(curMax*nums[i], curMin*nums[i]));
            curMin = Math.min(nums[i],Math.min(temp*nums[i], curMin*nums[i]));
            max = Math.max(max, curMax);
        }
        return max;
    }
}