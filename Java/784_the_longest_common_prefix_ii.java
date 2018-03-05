public class Solution {
    /**
     * @param dic: the n strings
     * @param target: the target string
     * @return: The ans
     */
    public int theLongestCommonPrefix(List<String> dic, String target) {
        int max = 0;
        char[] t = target.toCharArray();
        for(String str : dic) {
            char[] s = str.toCharArray();
            int i = 0;
            for(; i < s.length && i < t.length; i++)
            {
                if(s[i] != t[i]) {
                    break;
                }
            }
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
