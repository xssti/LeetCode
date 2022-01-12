class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> hash=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int diff = target -  nums[i];
            if(hash.containsKey(diff)){
                int[] result = {hash.get(diff),i};
                return result;
            }else{
            hash.put(nums[i],i);
            }
        }
        return null;
  }
}
    