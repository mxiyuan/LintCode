public class Solution {
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    public boolean isIsomorphic(String s, String t) {
        final int len = s.length();
        if(t.length() != len) {
            return false;
        }
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0; i < len; i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);
            boolean exsit1 = map1.containsKey(c1);
            boolean exsit2 = map2.containsKey(c2);
            if(exsit1 && exsit2){
                if(!map1.get(c1).equals(map2.get(c2))) {
                    return false;
                }
            } else if(!exsit1 && exsit2) {
                return false;
            } else if(exsit1 && !exsit2){
                return false;
            }
            map1.put(c1, i);
            map2.put(c2, i);
        }
        return true;
    }
}
