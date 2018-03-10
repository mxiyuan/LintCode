public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
            return 0;
        }
        final int m = obstacleGrid.length;
        final int n = obstacleGrid[0].length;
        int[][] matrix = new int[m][n];
        matrix[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for(int i = 1; i < m ; i++) {
            matrix[i][0] = obstacleGrid[i][0] == 1 ? 0 : matrix[i - 1][0];
        }
        for(int j = 1; j < n; j++) {
            matrix[0][j] = obstacleGrid[0][j] == 1 ? 0 : matrix[0][j - 1];
        }
        for(int i = 1; i < m ; i++) {
            for(int j = 1; j < n; j++) {
                matrix[i][j] = obstacleGrid[i][j] == 1 ?  0 : matrix[i][j - 1] + matrix[i - 1][j];
            }
        }
        return matrix[m - 1][n - 1];
    }
}
