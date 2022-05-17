class Solution {
    public int fib(int n) {
//         if(n<=1){
//             return n;
//         }
      
//             return fib(n-1)+fib(n-2);
//     }
        if(n<=1){
            return n;
        }else{
        int n0 = 0, n1=1;
        int result = 0;
         for(int i=2; i<=n; i++){
            result = n0 + n1;
            n0 = n1;
            n1 = result;
        }
        return result;
        }
}
}