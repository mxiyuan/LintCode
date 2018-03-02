public class Solution {
    /**
     * @param matrix: an input matrix 
     * @return: nums[0]: the maximum,nums[1]: the minimum
     */
    public int[] maxAndMin(int[][] matrix) {
        if(matrix == null) return new int[0];
        if(matrix.length == 0) return new int[0];
        if(matrix[0] == null) return new int[0];
        if(matrix[0].length == 0) return new int[0];
        int max = matrix[0][0];
        int min = matrix[0][0];
        for(int[] array : matrix) {
            for(int elem : array) {
                if(elem > max) {
                    max = elem;
                }
                if(elem < min) {
                    min = elem;
                }
            }
        }
        int[] result = new int[2];
        result[0] = max;
        result[1] = min;
        return result;
    }
}
