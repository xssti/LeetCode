class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = squareSum(n);
        }
        return n == 1;
    }
    public int squareSum(int n) {
        int sum = 0;
        while(n > 0) {
            int temp = n % 10;
            n = n / 10;
            sum += temp * temp;
        }
        return sum;
    }
}