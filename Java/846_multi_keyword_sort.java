public class Solution {
    /**
     * @param array: the input array
     * @return: the sorted array
     */
    public int[][] multiSort(int[][] array) {
        if(array == null || array[0].length == 0) {
            return new int[0][0];
        }
        final int len = array.length;
        List<Element> elements = new ArrayList<>();
        for(int i = 0; i < len; i++) {
            int first = array[i][0];
            int second = array[i][1];
            elements.add(new Element(first, second));
        }

        Collections.sort(elements, new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                if(o1.second != o2.second) {
                    return o2.second - o1.second;
                } else {
                    return o1.first - o2.first;
                }
            }
        });

        int[][] result = new int[len][2];
        for(int i = 0; i < len; i++) {
            Element elem = elements.get(i);
            result[i][0] = elem.first;
            result[i][1] = elem.second;
        }
        return result;
    }
    
    class Element {
        private int first;
        private int second;

        public Element(int first, int second) {
            this.first = first;
            this.second = second;
        }

        public int getFirst() {
            return first;
        }

        public int getSecond() {
            return second;
        }
    }
}
