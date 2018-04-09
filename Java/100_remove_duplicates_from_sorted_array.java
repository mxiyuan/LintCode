public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int slow = 0;
        int fast = 1;
        while(fast < nums.length) {
            if(nums[slow] != nums[fast]) {
                nums[++slow] = nums[fast];
            }
            ++fast;
        }
        return slow + 1;
    }
}
