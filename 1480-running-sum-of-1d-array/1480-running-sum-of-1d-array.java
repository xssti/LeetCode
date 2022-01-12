class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] sum=new int[n];
        int count=0;
        sum[0]=nums[0];
        for(int i=1;i<n;i++){
            sum[i] = sum[count]+nums[i];
            count++; 
        }
        return sum;
    }
}