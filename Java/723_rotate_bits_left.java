public class Solution {
    /*
     * @param : a number
     * @param : digit needed to be rorated
     * @return: a number
     */
    public int leftRotate(int n, int d) {
        d %= 32;
        long mask = 0xFFFFFFFFL;
        long high = n & (mask << (32 - d));
        high >>= (32 - d);
        long low = n & (mask >> d);
        low <<= d;
        return (int)(low + high);
    }
}
