class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i=0; i<=n; i++) {
            ans[i] = countEachBit(i);
        }
        return ans;
    }
    public int countEachBit(int num) {
        int count = 0;
        while(num != 0){
            if(num%2 == 1) count++;
            num = num/2;
        }
        return count;
    }
}