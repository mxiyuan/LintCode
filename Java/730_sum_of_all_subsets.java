public class Solution {
    /**
     * @param n: the given number
     * @return: Sum of elements in subsets
     */
    public int subSum(int n) {
        if(n < list.size()) {
            return list.get(n).intValue();
        }
        for(int i = list.size(); i <= n; i++) {
            list.add(list.get(i - 1) * 2 + i * (1 << (i - 1)));
        }
        return list.get(n).intValue();
    }
    private static ArrayList<Long> list = new ArrayList<>();
    static {
        list.add(0L);
    }
}
