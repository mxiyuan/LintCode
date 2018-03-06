public class Solution {
    /**
     * @param A: a string
     * @param B: a string
     * @return: a boolean
     */
    public boolean Permutation(String A, String B) {
        if(A == B) return true;
        if(A == null || B == null || A.length() != B.length()) return false;
        Map<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < A.length(); i++) {
            Character c1 = A.charAt(i);
            Character c2 = B.charAt(i);
            if(hashMap.containsKey(c1)) {
                int count = hashMap.get(c1);
                count++;
                if(count == 0) {
                    hashMap.remove(c1);
                } else {
                    hashMap.put(c1, count);
                }
            } else {
                hashMap.put(c1, 1);
            }
            if(hashMap.containsKey(c2)) {
                int count = hashMap.get(c2);
                count--;
                if(count == 0) {
                    hashMap.remove(c2);
                } else {
                    hashMap.put(c2, count);
                }
            } else {
                hashMap.put(c2, -1);
            }
        }
        return hashMap.size() == 0;
    }
}
