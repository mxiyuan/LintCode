public class Solution {
    /**
     * @param pattern: a string, denote pattern string
     * @param str: a string, denote matching string
     * @return: an boolean, denote whether the pattern string and the matching string match or not
     */
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || str == null) {
            return false;
        }
        final int len = pattern.length();
        String[] strs = str.split(" ");
        if(len == 0 || len != strs.length) {
            return false;
        }
        char[] p = pattern.toCharArray();
        Map<Character, String> map1 = new HashMap<Character, String>();
        Map<String, Character> map2 = new HashMap<String, Character>();
        for(int i = 0; i< len; ++i) {
            if(!map1.containsKey(p[i])) {
                map1.put(p[i], strs[i]);
            } else {
                if(!map1.get(p[i]).equals(strs[i])) {
                    return false;
                }
            }
            if(!map2.containsKey(strs[i])) {
                map2.put(strs[i], p[i]);
            } else {
                if(!map2.get(strs[i]).equals(p[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
