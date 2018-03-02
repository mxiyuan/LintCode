public class Solution {
    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    public double[] calculate(int r) {
        final double PI = 3.14;
        double[] result = new double[2];
        result[0] = 2 * PI * r;
        result[1] = PI * r * r;
        return result;
    }
}
