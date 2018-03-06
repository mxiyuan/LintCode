public class Solution {
    /**
     * @param num: a positive integer
     * @return: if num is a perfect square else False
     */
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            if(square < num) {
                left = mid + 1;
            } else if(square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
