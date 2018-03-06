public class Solution {
    /*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        if(nums == null || nums.size() == 0) {
            return new ArrayList<Long>();
        }
        final int len = nums.size();
        Long[] left = new Long[len];
        Long[] right = new Long[len];
        left[0] = 1L;
        for(int i = 1; i < len ; i++) {
            left[i] = nums.get(i - 1) * left[i - 1];
        }
        right[len - 1] = 1L;
        for(int i = len - 2; i >= 0; i--) {
            right[i] = nums.get(i + 1) * right[i + 1];
        }
        List<Long> list = new ArrayList<>();
        for(int i = 0; i< len; i++) {
            list.add(left[i] * right[i]);
        }
        return list;
    }
}
