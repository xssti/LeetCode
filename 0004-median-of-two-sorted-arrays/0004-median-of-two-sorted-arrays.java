class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums1)
            list.add(num);
        for(int num : nums2) list.add(num);
        Collections.sort(list);
        System.out.println(list);
        int mid = list.size()/2;
        if(list.size() % 2 != 0) return list.get(mid);
        double num  = (double)(list.get(mid - 1) + list.get(mid)) / 2 ;
        return num;
    }
}