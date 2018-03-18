public class Solution {
    /**
     * @param arr: The 2-dimension array
     * @return: Return the column the leftmost one is located
     */
    public int getColumn(int[][] arr) {
        if(arr == null || arr.length == 0 || arr[0].length == 0) {
            return -1;
        }
        final int row = arr.length;
        final int col = arr[0].length;
        for(int j = 0; j < col; j++) {
            for(int i = 0; i < row; i++) {
                if(arr[i][j] == 1) {
                    return j;
                }
            }
        }
        return -1;
    }
}
