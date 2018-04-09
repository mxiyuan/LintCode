class Solution{
public:
    /*
     * @param nums: a list of integers
     * @return: find a  majority number
     */
    int majorityNumber(vector<int> &nums) {
        int ans = nums[0];
        int cnt = 1;
        for (auto i : nums) {
            if (i == ans) {
                ++cnt;
            }
            else {
                --cnt;
                if (cnt == 0) {
                    ans = i;
                    cnt = 1;
                }
            }
        }
        return ans;
    }
};
