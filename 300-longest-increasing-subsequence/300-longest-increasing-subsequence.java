class Solution {
    public int lengthOfLIS(int[] nums) {
        TreeSet<Integer> bst = new TreeSet<>();
        for(int num: nums) {
            Integer higherOrequal = bst.ceiling(num);
            if(higherOrequal == null) {
                bst.add(num);
            } else {
                bst.remove(higherOrequal);
                bst.add(num);
            }
        }
        return bst.size();
    }
}