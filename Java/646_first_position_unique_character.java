public class Solution {
    /**
     * @param s: a string
     * @return: it's index
     */
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> hashMap = new HashMap<>();
        for(char c : chars) {
            if(hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        for(int i = 0; i < chars.length; i++) {
            if(hashMap.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
