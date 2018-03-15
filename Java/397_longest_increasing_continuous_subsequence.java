public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        if(A == null || A.length == 0) {
            return 0;
        }
        int upCount = 1;
        int downCount = 1;
        int upMax = 1;
        int downMax = 1;
        for(int i = 1; i < A.length; i++) {
            if(A[i] > A[i - 1]) {
                upCount++;
                if(upCount > upMax) {
                    upMax = upCount;
                }
                downCount = 1;
            } else if(A[i] < A[i - 1]) {
                downCount++;
                if(downCount > downMax) {
                    downMax = downCount;
                }
                upCount = 1;
            } else {
                upCount = 1;
                downCount = 1;
            }
        }
        return Math.max(upMax, downMax);
    }
}
