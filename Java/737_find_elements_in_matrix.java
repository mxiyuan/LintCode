public class Solution {
    /**
     * @param Matrix: the input
     * @return: the element which appears every row
     */
    public int FindElements(int[][] matrix) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < matrix.length; i++) {
            for(Integer n : matrix[i]) {
                if(hashMap.containsKey(n)) {
                    int count = hashMap.get(n);
                    count++;
                    hashMap.put(n, count);
                } else {
                    hashMap.put(n, 1);
                }
            }
        }
        for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if(entry.getValue() >= matrix.length) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
