public class Solution {
    /**
     * @param n: non-negative integer n.
     * @return: return whether a binary representation of a non-negative integer n is a palindrome.
     */
    public boolean isPalindrome(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n > 0) {
            list.add(n % 2);
            n /= 2;
        }
        if(list.size() > 1) {
            for(int i = 0; i < list.size() / 2; i++) {
                if(!list.get(i).equals(list.get(list.size() - 1 -i))) {
                    return false;
                }
            }
        }
        return true;
    }
}
