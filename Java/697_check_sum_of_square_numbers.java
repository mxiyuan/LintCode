public class Solution {
    /**
     * @param num: the given number
     * @return: whether whether there're two integers
     */
    public boolean checkSumOfSquareNumbers(int num) {
        if(num < 0) {
            return false;
        }
        int max = (int)Math.sqrt(num);
        for(int i = 0; i <= max; i++) {
            if(isSquareNumber(num - i * i)) {
                return true;
            }
        }
        return false;
    }
    private boolean isSquareNumber(int n) {
        if(n < 0) {
            return false;
        }
        if(n == 0 || n == 1) {
            return true;
        }
        long left = 1;
        long right = n;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if(square < n) {
                left = mid + 1;
            } else if(square > n) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
