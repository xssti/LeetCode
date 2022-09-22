class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if(row * col != r * c) return mat;
        int[][] reshaped = new int[r][c];
        int outputrows = 0;
        int outputCols = 0;
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                reshaped[outputrows][outputCols] = mat[i][j];
                outputCols++;
                if(outputCols == c) {
                    outputCols = 0;
                    outputrows++;
                }      
            }
        }
        return reshaped;
    }
}