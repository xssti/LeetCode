class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        map.put(0, 1);
        int rem = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            rem = sum%k;
            if(rem < 0) rem += k;
            if(map.containsKey(rem)) {
                count += map.get(rem);
                map.put(rem, map.get(rem)+1);
            }
            else{
                map.put(rem, 1);
            }
        }
        return count;
    }
}