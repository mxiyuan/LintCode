public class Solution {
    /**
     * @param str: a string containing uppercase alphabets and integer digits
     * @return: the alphabets in the order followed by the sum of digits
     */
    public String rearrange(String str) {
        if(str == null || str.length() == 0) {
            return "";
        }
        int[] charCount = new int[26];
        int digitSum = 0;
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'A' && c <= 'Z') {
                charCount[c - 'A']++;
            } else if(c >= '0' && c <= '9') {
                digitSum += c - '0';
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < charCount.length; i++) {
            char c = (char) ('A' + i);
            int count = charCount[i];
            for(int j = 0; j < count; j++) {
                sb.append(c);
            }
        }
        sb.append(digitSum);
        return sb.toString();
    }
}
