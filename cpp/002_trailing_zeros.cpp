// Time:  O(logn) = O(1)
// Space: O(1)

class Solution {
public:
    // param n : description of n
    // return: description of return
    long long trailingZeros(long long n) {
        long long zeroCount = 0;
        while (n > 0) {
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }
};
