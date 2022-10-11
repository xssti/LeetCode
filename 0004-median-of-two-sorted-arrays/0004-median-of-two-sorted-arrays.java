class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         if(nums2.length < nums1.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int[] smallArray = nums1, bigArray = nums2;
        int total = smallArray.length + bigArray.length;
        int half = total / 2;
        
        int left = 0, right = smallArray.length - 1;
        while(true) {
            int smallPointer = Math.floorDiv(right+left,2);
            int bigPointer = half - smallPointer - 2;
            
            int smallLeft = smallPointer < 0 ? Integer.MIN_VALUE : smallArray[smallPointer];
            int smallRight = smallPointer+1 >= smallArray.length ? Integer.MAX_VALUE : smallArray[smallPointer+1];
            int bigLeft = bigPointer < 0 ? Integer.MIN_VALUE : bigArray[bigPointer];
            int bigRight = bigPointer+1 >= bigArray.length ? Integer.MAX_VALUE : bigArray[bigPointer+1];
            
            if(smallLeft <= bigRight && bigLeft <= smallRight) {
                if(total % 2 != 0) {
                    return Math.min(smallRight, bigRight);
                }
                return (double) ((Math.max(smallLeft, bigLeft) + Math.min(smallRight, bigRight))) / 2;
            } else if(smallLeft > bigRight) {
                right = smallPointer - 1;
            } else {
                left = smallPointer + 1;
            }
        }
    }
}