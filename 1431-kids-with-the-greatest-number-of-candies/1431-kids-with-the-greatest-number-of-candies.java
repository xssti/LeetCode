class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int maxValue = Integer.MIN_VALUE;
        int temp = 0;
        for(int i=0; i<candies.length; i++) {
            maxValue = Math.max(maxValue, candies[i]);
        }
        for(int i=0; i<candies.length; i++) {
            temp = candies[i] + extraCandies;
            if(temp >= maxValue) res.add(true);
            else res.add(false);
        }
        return res;
    }
}