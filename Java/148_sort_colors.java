public class Solution {
    /**
     * @param nums: A list of integer which is 0, 1 or 2 
     * @return: nothing
     */
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int left = 0;
        int right = nums.length - 1;
        for(int i = 0; i < right + 1;) {
            while (i == left && nums[left] == 0) {
                i++;
                left++;
            }
            while (nums[right] == 2) {
                right--;
            }
            if(nums[i] == 0) {
                int temp = nums[i];
                nums[i] = nums[left];
                nums[left] = temp;
                left++;
            } else if(nums[i] == 2) {
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;
                right--;
            } else {
                i++;
            }
        }
    }
}
