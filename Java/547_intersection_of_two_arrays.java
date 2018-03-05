public class Solution {
    
    /*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for(Integer i : nums1) {
            set1.add(i);
        }
        Set<Integer> set = new HashSet<>();
        for(Integer i : nums2) {
            if(set1.contains(i)) {
                set.add(i);
            }
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(Integer i : set) {
            result[index] = i; 
            index++;
        }
        return result;
    }
};
