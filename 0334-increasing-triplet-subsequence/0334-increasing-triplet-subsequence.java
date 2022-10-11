class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean[] boolArray = new boolean[nums.length];
        boolArray[0] = false;
        int min = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] <= min) {
                boolArray[i] = false;
                min = nums[i];
            }
            else {
                boolArray[i] = true;
            }
        }
        int max = nums[nums.length - 1];
        for(int i = nums.length-2; i>=0 ;i--) {
            if(nums[i] < max) {
                if(boolArray[i]) return true;
            } else max = nums[i];
        }
        return false;
    }
}