public class Solution {
    /**
     * @param grid: an integer matrix
     * @return: an integer 
     */
    public int numIslandCities(int[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        final int row = grid.length;
        final int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] > 0) {
                    flag = false;
                    spread(grid, i, j);
                    if(flag) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    
    private boolean flag;

    private void spread(int[][] grid, int i, int j) {
        if(grid[i][j] == 2) {
            flag = true;
        }
        grid[i][j] = 0;
        //up
        if(i - 1 >= 0 && grid[i - 1][j] > 0) {
            spread(grid, i - 1, j);
        }
        //down
        if(i + 1 <= grid.length - 1 && grid[i + 1][j] > 0) {
            spread(grid, i + 1, j);
        }
        //left
        if(j - 1 >= 0 && grid[i][j - 1] > 0) {
            spread(grid, i, j - 1);
        }
        //right
        if(j + 1 <= grid[0].length - 1 && grid[i][j + 1] > 0) {
            spread(grid, i, j + 1);
        }
        return;
    }
}
