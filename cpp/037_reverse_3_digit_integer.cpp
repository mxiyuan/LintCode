class Solution {
public:
    /**
     * @param number: A 3-digit number.
     * @return: Reversed number.
     */
    int reverseInteger(int number) {
        const int len = 3;
        int result = 0;
        for(int i = 0; i< len; i++) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }
};
