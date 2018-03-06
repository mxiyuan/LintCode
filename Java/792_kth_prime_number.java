public class Solution {
    /**
     * @param n: the number
     * @return: the rank of the number
     */
    public int kthPrime(int n) {
        boolean[] table = new boolean[n - 1];
        for(int i = 0; i < table.length; i++) {
            table[i] = true;
        }
        int count = 0;
        for(int i = 0; i < table.length; i++) {
            if(table[i]) {
                int prime = i + 2;
                count++;
                for(int j = i + prime; j < table.length; j += prime) {
                    table[j] = false;
                }
            } else {
                continue;
            }
        }
        return count;
    }
}
