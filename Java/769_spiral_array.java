public class Solution {
    /**
     * @param n: a Integer
     * @return: a spiral array
     */
    public int[][] spiralArray(int n) {
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int start = 1;
        while (left <= right && top <= bottom) {
            if(top == bottom) {
                for(int i = left; i <= right; i++) {
                    matrix[top][i] = start++;
                }
                break;
            }
            if(left == right) {
                for(int i = top; i <= bottom; i++) {
                    matrix[i][left] = start++;
                }
                break;
            }
            for(int i = left; i < right; i++) {
                matrix[top][i] = start++;
            }
            for(int i = top; i < bottom; i++) {
                matrix[i][right] = start++;
            }
            for(int i = right; i > left; i--) {
                matrix[bottom][i] = start++;
            }
            for(int i = bottom; i > top; i--) {
                matrix[i][left] = start++;
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return matrix;
    }
}
