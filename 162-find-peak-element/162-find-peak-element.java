class Solution {
    public int findPeakElement(int[] nums) {
        // int i = 0;
        // while(i + 1 < nums.length && nums[i] < nums[i+1]) i++;
        // return i;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid+1]) left = mid + 1;
            else right = mid;
        }
        return left;
    }
}