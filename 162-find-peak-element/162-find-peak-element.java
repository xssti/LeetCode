class Solution {
    public int findPeakElement(int[] nums) {
        int i = 0;
        while(i + 1 < nums.length && nums[i] < nums[i+1]) i++;
        return i;
    }
}