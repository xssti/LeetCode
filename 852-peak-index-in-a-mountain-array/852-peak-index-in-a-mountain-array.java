class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       // int L = 0, R = arr.length - 1;
       //  while (L < R) {
       //      int mid = L + (R - L) / 2;
       //      if (arr[mid] < arr[mid+1]) {
       //          L = mid + 1;
       //      } else {
       //          R = mid;
       //      }
       //  }
       //  return L;
        int i = 0;
        while (arr[i] < arr[i+1]) i++;
        return i;
    }
}