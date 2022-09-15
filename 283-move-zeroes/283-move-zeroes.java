class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroCount = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[nonZeroCount++] = nums[i];
            } 
        }
        for(int i= nonZeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}