class Solution {
public:
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    int removeDuplicates(vector<int> &nums) {
        if(nums.empty()) {
            return 0;
        }

        int left = 0;
        int right = 1;
        while(right < nums.size()) {
            if(nums[left] != nums[right]) {
                ++left;
                nums[left] = std::move(nums[right]);
            }
            ++right;
        }

        return left + 1;
    }
};