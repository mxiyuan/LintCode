public class Solution {
    /**
     * @param a: a positive integer
     * @return: the smallest positive integer whose multiplication of each digit equals to a
     */
    public int smallestFactorization(int a) {
        if(a < 10) {
            return a;
        }
        long result = 0;
        long base = 1;
        for(int i = 9; i > 1; i--) {
            while (a % i == 0) {
                result += i * base;
                base *= 10;
                a /= i;
            }
        }
        if(a == 1 && result <= Integer.MAX_VALUE) {
            return (int)result;
        }
        return 0;
    }
}
