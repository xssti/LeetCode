class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0 ;i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }
        for(int key : map.keySet()) {
            ans = key;
        }
        return ans;
  }
}