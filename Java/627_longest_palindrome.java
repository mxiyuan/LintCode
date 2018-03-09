public class Solution {
    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(hashMap.containsKey(c)) {
                int count = hashMap.get(c);
                count++;
                hashMap.put(c, count);
            } else {
                hashMap.put(c, 1);
            }
        }

        int evenSum = 0;
        int oddSum = 0;
        boolean hasOdd = false;
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            int count = entry.getValue();
            if(count % 2 == 0) {
                evenSum += count;
            } else {
                hasOdd = true;
                oddSum += count - 1;
            }
        }

        if(hasOdd) {
            return evenSum + oddSum + 1;
        } else {
            return evenSum;
        }
    }
}
