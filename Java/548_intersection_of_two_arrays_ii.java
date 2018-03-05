public class Solution {
    
    /*
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
       Map<Integer, Integer> map1 = new HashMap<>();
        for(Integer i : nums1) {
            if(map1.containsKey(i)) {
                map1.put(i, map1.get(i) + 1);
            } else {
                map1.put(i, 1);
            }
        }
        Map<Integer, Integer> map2 = new HashMap<>();
        for(Integer i : nums2) {
            if(map2.containsKey(i)) {
                map2.put(i, map2.get(i) + 1);
            } else {
                map2.put(i, 1);
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer i : map2.keySet()) {
            if(map1.containsKey(i)) {
                int min = Math.min(map1.get(i), map2.get(i));
                map.put(i, min);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i : map.keySet()) {
            int count = map.get(i);
            for(int j = 0; j< count; j++) {
                list.add(i);
            }
        }
        int[] result = new int[list.size()];
        for(int i= 0;i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
};
