public class Solution {
    /**
     * @param str: the string that needs to be sorted
     * @return: sorted string
     */
    public String stringSort(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if(hashMap.containsKey(c)) {
                int count = hashMap.get(c) + 1;
                hashMap.put(c, count);
            } else {
                hashMap.put(c, 1);
            }
        }
        ArrayList<Map.Entry<Character, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                if(o1.getValue() != o2.getValue()) {
                    return o2.getValue() - o1.getValue();
                } else {
                    return o1.getKey() - o2.getKey();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list) {
            char c = entry.getKey();
            int count = entry.getValue();
            for(int i = 0; i < count; i++) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
