public class Solution {
    /**
     * @param n: non-negative integer, n posts
     * @param k: non-negative integer, k colors
     * @return: an integer, the total number of ways
     */
    public int numWays(int n, int k) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return k;
        }
        if (n == 2) {
            return k * k;
        } else {
            int[] m = new int[n];
            m[0] = k;
            m[1] = k * k;
            for (int i = 2; i < n; i++) {
                m[i] = m[i-1] * (k-1) + m[i-2] * (k-1);
            }
            return m[n-1];
        }
    }
}
