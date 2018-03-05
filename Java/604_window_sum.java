public class Solution {
    /**
     * @param nums: a list of integers.
     * @param k: length of window.
     * @return: the sum of the element inside the window at each moving.
     */
    public int[] winSum(int[] nums, int k) {
       if(nums == null || nums.length == 0 || nums.length < k) {
            return new int[0];
        }
        final int len = nums.length;
        int[] result = new int[len + 1 - k];
        result[0] = 0;
        for(int j = 0; j < k; j++) {
            result[0] += nums[j];
        }
        for(int i = 1; i < result.length; i++) {
            result[i] = result[i - 1] - nums[i - 1] + nums[i + k - 1];
        }
        return result;
    }
}
