public class Solution {
    /**
     * @param matrix: A lsit of lists of integers
     * @return: nothing
     */
    public void setZeroes(int[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        final int row = matrix.length;
        final int col = matrix[0].length;
        Set<Integer> rowFlag = new HashSet<>();
        Set<Integer> colFlag = new HashSet<>();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(matrix[i][j] == 0) {
                    rowFlag.add(i);
                    colFlag.add(j);
                }
            }
        }
        for(Integer i : rowFlag) {
            for(int j = 0; j < col; j++) {
                matrix[i][j] = 0;
            }
        }
        for(Integer j : colFlag) {
            for(int i = 0; i < row; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
