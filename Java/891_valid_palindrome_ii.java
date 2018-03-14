public class Solution {
    /**
     * @param s: a string
     * @return: nothing
     */
    public boolean validPalindrome(String s) {
        char[] cs = s.toCharArray();
        int lf = 0, rt = s.length() - 1;
        while (lf < rt) {
            if (cs[lf] != cs[rt]) return isPalindrome(cs, lf + 1, rt) || isPalindrome(cs, lf, rt - 1);
            lf ++;
            rt --;
        }
        return true;
    }

    public boolean isPalindrome(char[] cs, int start, int end) {
        while (start < end) {
            if (cs[start++] != cs[end--]) return false;
        }
        return true;
    }
}
