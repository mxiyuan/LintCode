public class Solution {
    /**
     * @param s1: the 1st string
     * @param s2: the 2nd string
     * @return: uncommon characters of given strings
     */
    public String concatenetedString(String s1, String s2) {
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(Character c : array1) {
            set1.add(c);
        }
        for(Character c : array2) {
            set2.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c : array1) {
            if(set1.contains(c) && set2.contains(c)) {
                continue;
            }
            sb.append(c);
        }
        for(Character c : array2) {
            if(set1.contains(c) && set2.contains(c)) {
                continue;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
