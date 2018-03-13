public class Solution {
    /**
     * @param points: the point List
     * @return: the numbers of pairs which meet the requirements
     */
    public int pairNumbers(Point[] points) {
        if(points == null || points.length == 0) {
            return 0;
        }
        int[][] count = new int[2][2];
        for(Point p : points) {
            count[p.x % 2][p.y % 2]++;
        }
        int result = 0;
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                int c  = count[i][j];
                if(c > 1) {
                    result += c * (c - 1) / 2;
                }
            }
        }
        return result;
    }
}
