public class Solution {
    /*
     * @param character: a character
     * @return: a character
     */
    public char lowercaseToUppercase(char character) {
        final int diff = 'a' - 'A';
        return (char)(character - diff);
    }
}
