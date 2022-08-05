class Solution {
    Map<Integer, Integer> map = new HashMap<>();
    public int combinationSum4(int[] nums, int target) {
        return combinationSumHelper(nums, target);
    }
    public int combinationSumHelper(int[] nums, int target) {
        if(map.containsKey(target)) return map.get(target);
        if(target == 0) return 1;
        else if(target < 0) return 0;
        else {
            int possibleWays = 0;
            for(int num : nums) {
                possibleWays += combinationSumHelper(nums, target - num);
            }
            map.put(target, possibleWays);
            return possibleWays;
        }
    }
}