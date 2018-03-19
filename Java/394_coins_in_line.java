public class Solution {
    /**
     * @param n: An integer
     * @return: A boolean which equals to true if the first player will win
     */
    public boolean firstWillWin(int n) {
        int remainder = n % 3;
        if(remainder == 0) {
            return false;
        } else {
            return true;
        }
    }
}
