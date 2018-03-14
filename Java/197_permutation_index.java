public class Solution {
    /**
     * @param A: An array of integers
     * @return: A long integer
     */
    public long permutationIndex(int[] A) {
       if(A == null || A.length == 0 || A.length == 1) {
            return 0;
        }
        long result = 0;
        long factor = 1;
        for(int i = A.length - 2; i >= 0; i--) {
            factor *= (A.length - 1 - i);
            int count = 0;
            for(int j = i + 1; j < A.length; j++) {
                if(A[j] < A[i]) {
                    count++;
                }
            }
            result += factor * count;
        }
        return result + 1;
    }
}
