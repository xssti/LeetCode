class Solution {
    public int maxSubArray(int[] nums) {
    //     int max_sum = Integer.MIN_VALUE;
    //     for(int i=0;i<nums.length;i++){
    //         int sum = 0;
    //         for(int j=i;j<nums.length;j++){
    //             sum += nums[j];
    //             max_sum = Math.max(max_sum, sum);
    //         }
    //     }
    //     return max_sum;
    // }
        int max_sum = Integer.MIN_VALUE;
        int cur_sum = 0;
        for(int i=0;i<nums.length;i++){
           cur_sum += nums[i];
            if(cur_sum <nums[i]){
                cur_sum = nums[i];
            }
            max_sum = Math.max(max_sum,cur_sum);
        }
        return max_sum;
}
}