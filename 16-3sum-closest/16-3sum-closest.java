class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        int ans = 0;
        int left = 0, right = 0;
        for(int i=0; i<n; i++) {
            left = i+1;
            right = n-1;
            while(left < right){
                int diff = Math.abs(nums[i]+nums[left]+nums[right] - target);
                if(diff < mindiff) {
                    ans = nums[i]+ nums[left]+ nums[right];
                    mindiff = diff;
                }
                if(nums[i]+nums[left]+nums[right] == target) return target;
                else if(nums[i]+ nums[left]+ nums[right] < target){
                    left ++;
                }else {
                    right --;
                }
            }
            
        }
        return ans;
    }
}