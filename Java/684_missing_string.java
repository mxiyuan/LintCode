public class Solution {
    /**
     * @param str1: a given string
     * @param str2: another given string
     * @return: An array of missing string
     */
    public List<String> missingString(String str1, String str2) {
        String[] strs1 = str1.split(" ");
        String[] strs2 = str2.split(" ");
        Set<String> hashSet = new HashSet<>();
        for(String str : strs2) {
            hashSet.add(str);
        }
        List<String> list = new ArrayList<>();
        for(String str : strs1) {
            if(!hashSet.contains(str)) {
                list.add(str);
            }
        }
        return list;
    }
}
