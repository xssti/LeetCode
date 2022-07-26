class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
       for(int i: map.values()){
           int temp = i;
           count += (i*(i-1))/2;
       } 
        return count;
    }
}