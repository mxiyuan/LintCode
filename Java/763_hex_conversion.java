public class Solution {
    /**
     * @param n: a decimal number
     * @param k: a Integer represent base-k
     * @return: a base-k number
     */
    public String hexConversion(int n, int k) {
        final char[] digits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7',
                                         '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder str = new StringBuilder();
        do {
            str.insert(0, digits[n % k]);
            n /= k;
        }while(n > 0);
        return str.toString();
    }
}
