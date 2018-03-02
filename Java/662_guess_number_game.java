/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    /**
     * @param n an integer
     * @return the number you guess
     */
    public int guessNumber(int n) {
        long left = 1;
        long right = n;
        while (left <= right) {
            int mid = (int) ((left + right) / 2);
            int g = guess(mid);
            if (g < 0) {
                right = mid - 1;
            } else if (g > 0) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return 0;
    }
}
