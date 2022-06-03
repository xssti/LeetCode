class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowArr = new int[m];
        int[] colArr = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 0){
                    rowArr[i] = 1;
                    colArr[j] = 1;
                }
            }
        }
        for(int i=0;i<m;i++){
            if(rowArr[i]==1){
                for(int j=0;j<n;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(colArr[i]==1){
                for(int j=0;j<m;j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
}