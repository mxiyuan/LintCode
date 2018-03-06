public class Solution {
    /*
     * @param board: the board
     * @return: whether the Sudoku is valid
     */
    public boolean isValidSudoku(char[][] board) {
       final int N = 9;
        boolean[][] row = new boolean[N][N];
        boolean[][] col = new boolean[N][N];
        boolean[][] cube = new boolean[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                char c = board[i][j];
                if(c >= '1' && c <= '9') {
                    int v = c - '1';
                    int cubeNum = (i / 3) * 3 + j / 3;
                    if(row[i][v] || col[j][v] || cube[cubeNum][v]) {
                        return false;
                    } else {
                        row[i][v] = true;
                        col[j][v] = true;
                        cube[cubeNum][v] = true;
                    }
                }
            }
        }
        return true;
    }
}
