public class Solution {
    /**
     * @param m: positive integer (1 <= m <= 100)
     * @param n: positive integer (1 <= n <= 100)
     * @return: An integer
     */
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        matrix[0][0] = 1;
        for(int i = 1; i < m ; i++) {
            matrix[i][0] = 1;
        }
        for(int j = 1; j < n; j++) {
            matrix[0][j] = 1;
        }
        for(int i = 1; i < m ; i++) {
            for(int j = 1; j < n; j++) {
                matrix[i][j] = matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix[m - 1][n - 1];
    }
}
