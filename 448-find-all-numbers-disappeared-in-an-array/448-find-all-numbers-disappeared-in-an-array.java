class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++) {
            int curr = Math.abs(nums[i]);
            nums[curr - 1] = -(Math.abs(nums[curr - 1]));
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) list.add(i+1);
        }
        return list;
    }
}