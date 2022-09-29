class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int low = 0;
        int high = arr.length - 1;
        while(high - low >= k) {
            int tempLow = Math.abs(arr[low] - x);
            int tempHigh = Math.abs(arr[high] - x);
            if(tempLow <= tempHigh) {
                high --;
            } else {
                low ++;
            }
        }
        while(low <= high) {
            list.add(arr[low++]);
        }
        return list;
    }
}