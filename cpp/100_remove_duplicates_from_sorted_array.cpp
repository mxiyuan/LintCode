// Time:  O(n)
// Space: O(1)

class Solution {
public:
    /**
     * @param A: a list of integers
     * @return : return an integer
     */
    int removeDuplicates(vector<int> &nums) {
        if (nums.empty()) {
            return 0;
        }
        auto slow = nums.begin();
        auto fast = slow + 1;
        while (fast != nums.end()) {
            if (*fast != *slow) {
                *(++slow) = *fast;
            }
            ++fast;
        }
        nums.resize(slow - nums.begin() + 1);
        return nums.size();
    }
};
