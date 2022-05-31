class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        for(int i=1; i<= n;i++){
            if(n%i==0){
                arr.add(i);
            }
        }
        if(k > arr.size()) return -1;
        return arr.get(k-1);
    }
}