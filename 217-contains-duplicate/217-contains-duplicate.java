class Solution {
    public boolean containsDuplicate(int[] nums) {
    //    Map<Integer,Integer> map = new HashMap<>();
    //     for(int i=0;i<nums.length;i++){
    //         if(map.containsKey(nums[i])){
    //             return true;
    //         }else{
    //             map.put(nums[i],i);
    //         }
    //     }
    //     return false;
    // }
    Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
}
}