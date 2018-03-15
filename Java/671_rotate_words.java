public class Solution {
    /*
     * @param words: A list of words
     * @return: Return how many different rotate words
     */
    public int countRotateWords(List<String> words) {
        if(words == null || words.size() == 0) {
            return 0;
        }
        Set<MyString> set = new HashSet<>();
        for(String word : words) {
            set.add(new MyString(word));
        }
        return set.size();
    }

    class MyString {
        private String value;
        public MyString(String value) {
            this.value = value;
        }
        @Override
        public boolean equals(Object obj) {
            if(obj == null || !(obj instanceof MyString)) return false;
            String str1 = this.value;
            String str2 = ((MyString) obj).value;
            if(str1.length() != str2.length()) {
                return false;
            }
            String str = str1 + str1;
            return str.contains(str2);
        }

        @Override
        public int hashCode() {
            char[] array = this.value.toCharArray();
            Arrays.sort(array);
            String str = new String(array);
            return str.hashCode();
        }
    }
}
