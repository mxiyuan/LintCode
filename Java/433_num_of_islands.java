public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] grid) {
        if(grid == null || grid.length == 0) {
            return 0;
        }
        final int row = grid.length;
        final int col = grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j]) {
                    count++;
                    spread(grid, i, j);
                }
            }
        }
        return count;
    }

    private void spread(boolean[][] grid, int i, int j) {
        grid[i][j] = false;
        //up
        if(i - 1 >= 0 && grid[i - 1][j]) {
            spread(grid, i - 1, j);
        }
        //down
        if(i + 1 <= grid.length - 1 && grid[i + 1][j]) {
            spread(grid, i + 1, j);
        }
        //left
        if(j - 1 >= 0 && grid[i][j - 1]) {
            spread(grid, i, j - 1);
        }
        //right
        if(j + 1 <= grid[0].length - 1 && grid[i][j + 1]) {
            spread(grid, i, j + 1);
        }
        return;
    }
}
