public class Solution {
    /**
     * @param inputA: Input stream A
     * @param inputB: Input stream B
     * @return: The answer
     */
    public String inputStream(String inputA, String inputB) {
        String strA = getString(inputA);
        String strB = getString(inputB);
        return strA.equals(strB) ? "YES" : "NO";
    }
    
    private String getString(String inputStream) {
        StringBuilder str = new StringBuilder();
        for(char c : inputStream.toCharArray()) {
            if(c == '<') {
                if(str.length() > 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            }
            else {
                str.append(c);
            }
        }
        return str.toString();
    }
}
