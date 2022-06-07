class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int curr = Math.abs(nums[i]);
            if(nums[curr - 1] < 0) {
                ans.add(curr);
            } else {
                nums[curr - 1] = -nums[curr - 1];
            }
        }
        return ans;
    }
}