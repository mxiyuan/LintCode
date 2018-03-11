public class Solution {
    /**
     * @param A: a array of integers
     * @return : return an integer
     */
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int count = 1;
        for(int right = 1; right < nums.length; right++) {
            if(nums[right] == nums[left] && count < 2) {
                count++;
                nums[++left] = nums[right];
            } else if(nums[left] != nums[right]) {
                count = 1;
                nums[++left] = nums[right];
            }
        }
        return left + 1;
    }
}
