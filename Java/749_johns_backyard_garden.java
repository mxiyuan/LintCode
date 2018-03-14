public class Solution {
    /**
     * @param x: the wall's height
     * @return: YES or NO
     */
    public String isBuild(int x) {
        if(x < 3) {
            return "NO";
        }
        for(int i = x; i > 0; i -= 7) {
            if(i % 3 == 0) {
                return "YES";
            }
        }
        return "NO";
    }
}
