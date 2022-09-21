class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int S = 0;
        for (int x: nums)
            if (x % 2 == 0)
                S += x;
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; ++i) {
            int val = queries[i][0], index = queries[i][1];
            if (nums[index] % 2 == 0) S -= nums[index];
            nums[index] += val;
            if (nums[index] % 2 == 0) S += nums[index];
            ans[i] = S;
        }

        return ans;
    }
}