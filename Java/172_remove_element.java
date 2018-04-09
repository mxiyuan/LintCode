public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        int fast = 0, slow = 0;
        int n = A.length;
        int ret = 0;
        while(fast < n){
            if(A[fast] != elem) {
                ++ret;
                A[slow++] = A[fast];
            }
            ++fast;
        }
        return ret;
    }
}
