public class Solution {
    /**
     * @param str: str: the given string
     * @return: char: the first unique character in a given string
     */
    public char firstUniqChar(String str) {
       HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(hashMap.containsKey(c)) {
                int count = hashMap.get(c) + 1;
                hashMap.put(c, count);
            } else {
                hashMap.put(c, 1);
            }
        }
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(hashMap.get(c) == 1) {
                return c;
            }
        }
        return '\0';
    }
}
