class Solution {
    public int[] numsSameConsecDiff(int N, int K) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<10; i++) {
            recurse(N - 1, K, i, list);
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++) ans[i] = list.get(i);
        return ans;
    }
    public void recurse(int n, int k, int curr, List<Integer> list) {
        if(n == 0) {
            list.add(curr);
            return;
        }
        int lastdigit =  curr % 10;
        if(lastdigit - k >= 0) {
            recurse(n-1, k, curr*10 + lastdigit-k, list);
        }
        if(k !=0 && lastdigit+k <= 9){
            recurse(n-1, k, curr*10 + lastdigit + k, list);
        }
    }
}