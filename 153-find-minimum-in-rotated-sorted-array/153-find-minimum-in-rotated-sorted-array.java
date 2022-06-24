class Solution {
    public int findMin(int[] nums) {
        int len = nums.length;
        if (nums[len - 1] > nums[0]) return nums[0];
        int left = 0, right = len - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        return nums[left];
    }
}