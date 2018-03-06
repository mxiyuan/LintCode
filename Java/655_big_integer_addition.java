public class Solution {
    /**
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     * @return: return sum of num1 and num2
     */
    public String addStrings(String num1, String num2) {
        char[] str1 = num1.toCharArray();
        char[] str2 = num2.toCharArray();
        ArrayList<Integer> result = new ArrayList<>();
        int carry = 0;
        for(int i = 0; i < str1.length || i < str2.length; i++) {
            int a1 = 0;
            int a2 = 0;
            if(i < str1.length) {
                a1 = str1[str1.length - 1 - i] - '0';
            }
            if(i < str2.length) {
                a2 = str2[str2.length - 1 - i] - '0';
            }
            int sum = a1 + a2 + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }
        if(carry > 0) {
            result.add(carry % 10);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < result.size(); i++) {
            sb.append(result.get(result.size() - 1 - i));
        }
        return sb.toString();
    }
}
