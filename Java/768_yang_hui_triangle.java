public class Solution {
    /**
     * @param n: a Integer
     * @return: the first n-line Yang Hui's triangle
     */
    public List<List<Integer>> calcYangHuisTriangle(int n) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            if(i == 0) {
                result.add(list);
                continue;
            }
            if(i == 1)
            {
                list.add(1);
                result.add(list);
                continue;
            }
            List<Integer> upper = result.get(i - 1);
            for(int j = 0; j < i - 1; j++) {
                list.add(upper.get(j) + upper.get(j + 1));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
