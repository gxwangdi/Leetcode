public class NumMatrix {

    long[][] sum;
    int[][] src;
    int m;
    int n;
    
    public NumMatrix(int[][] matrix) {
        src = matrix; 
        if (matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        m = matrix.length;
        n = matrix[0].length;
        sum = new long[m][n];      
        
        sum[0][0] = matrix[0][0];
        for (int i=1; i<m; i++) {
            sum[i][0] = sum[i-1][0] + matrix[i][0];
        }
        for (int j=1; j<n; j++) {
            sum[0][j] = sum[0][j-1] + matrix[0][j];
        }
        for (int i=1; i<m; i++) {
            for (int j=1; j<n; j++) {
                sum[i][j] = sum[i-1][j] + sum[i][j-1] - sum[i-1][j-1] + matrix[i][j];
            }
        }
        
    }

    public void update(int row, int col, int val) {
        long diff = val - src[row][col];
        src[row][col] = val;
        for (int i=row; i<m; i++) {
            for (int j=col; j<n; j++) {
                sum[i][j] += diff;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        long res = sum[row2][col2];
        if (col1 > 0) {
            res = res - sum[row2][col1-1];
        }
        if (row1 > 0) {
            res = res - sum[row1-1][col2];
        }
        if (col1 > 0 && row1 > 0) {
            res = res + sum[row1-1][col1-1];
        }
        return (int)res;
    }
}


// Your NumMatrix object will be instantiated and called as such:
// NumMatrix numMatrix = new NumMatrix(matrix);
// numMatrix.sumRegion(0, 1, 2, 3);
// numMatrix.update(1, 1, 10);
// numMatrix.sumRegion(1, 2, 3, 4);



