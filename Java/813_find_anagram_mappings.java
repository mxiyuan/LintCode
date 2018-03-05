public class Solution {
    /**
     * @param A: lists A
     * @param B: lists B
     * @return: the index mapping
     */
    public int[] anagramMappings(int[] A, int[] B) {
        if(A == null || B == null) {
            return new int[0];
        }
        Map<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < B.length; i++) {
            hashMap.put(B[i], i);
        }
        int[] result = new int[A.length];
        for(int i = 0; i< A.length; i++) {
            result[i] = hashMap.get(A[i]);
        }
        return result;
    }
}
