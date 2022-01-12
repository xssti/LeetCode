class Solution {
    public int[] getConcatenation(int[] nums) {
        int count=nums.length;
        int[] ans=new int[2*count];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+count]=nums[i];
        }
        return ans;
    }
}