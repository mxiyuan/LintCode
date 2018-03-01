public class Solution {
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    public int reverseInteger(int number) {
        final int len = 3;
        int result = 0;
        for(int i = 0; i< len; i++) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }
}
