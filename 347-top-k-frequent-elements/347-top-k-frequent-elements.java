class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        for(int key: map.keySet()) pq.add(key);
        int[] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = pq.poll();
        }
        return res;
    }
}