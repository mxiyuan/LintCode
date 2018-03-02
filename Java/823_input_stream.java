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
        int count = 0;
        for(char c : inputStream.toCharArray()) {
            if(c == '<') {
                if(count > 0) {
                    str.deleteCharAt(count - 1);
                    count--;
                }
            }
            else {
                str.append(c);
                count++;
            }
        }
        return str.toString();
    }
}
