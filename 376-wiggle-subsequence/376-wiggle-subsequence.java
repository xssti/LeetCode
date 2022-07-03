class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int[] diff = new int[n - 1];
        for(int i=1; i<n; i++) {
            diff[i - 1] = nums[i] - nums[i - 1];
        }
        int pos_count = 0, neg_count = 0;
        boolean sign = true;
        for(int i=0; i<diff.length; i++){
            if((diff[i] > 0 && sign) || (diff[i] < 0 && !sign)) {
                pos_count ++;
                sign = !sign;
            }
        }
        sign = false;
        for(int i=0; i<diff.length; i++){
            if((diff[i] > 0 && sign) || (diff[i] < 0 && !sign)) {
                neg_count ++;
                sign = !sign;
            }
        }
        return Math.max(pos_count, neg_count)+1;
    }
}