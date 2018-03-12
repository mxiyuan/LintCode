public class Solution {
    /**
     * @param words: a list of string
     * @return: a boolean
     */
    public boolean validWordSquare(String[] words) {
        if(words == null || words.length == 0) {
            return false;
        }
        final int len = words.length;
        for(int i = 0; i < len; i++) {
            String word = words[i];
            if(word.length()!= len) {
                return false;
            }
        }
        for(int i = 0; i < len; i++) {
            String word = words[i];
            for(int j = 0; j < len; j++) {
                if(word.charAt(j) != words[j].charAt(i)) {
                    return false; 
                }
            }
        }
        return true;
    }
}
