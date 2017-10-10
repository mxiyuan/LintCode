class Solution {
public:
    /*
     * @param nums: an integer array
     * @return: 
     */
    void moveZeroes(vector<int>& nums) {
        size_t pos = 0;
        for(auto &num : nums) {
            if(num) {
                swap(nums[pos++], num);
            }
        }
    }
};
