public class Solution {
    /**
     * @param ages: The ages
     * @return: The answer
     */
    public int friendRequest(int[] ages) {
        if(ages == null || ages.length < 2) {
            return 0;
        }
        Arrays.sort(ages);
        int count = 0;
        for(int i = 0; i < ages.length; i++) {
            int ageA = ages[i];
            int bound = ageA / 2 + 7;
            if(ageA > 100) {
                bound = Math.max(bound, 99);
            }
            for(int j = i - 1; j >= 0 && ages[j] > bound; j--) {
                count++;
            }
            if(ageA > bound) {
                for(int j = i + 1; j < ages.length && ages[j] == ageA; j++) {
                    count++;
                }
            }
        }
        return count;
    }
}
