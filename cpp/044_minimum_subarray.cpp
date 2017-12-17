class Solution {
public:
    /*
     * @param nums: a list of integers
     * @return: A integer indicate the sum of minimum subarray
     */
    int minSubArray(vector<int> &nums) {
        int minSum = 0;
        int curSum = 0;
        for (auto it = nums.begin(); it != nums.end(); ++it)
        {
            if (it == nums.begin())
            {
                minSum = *it;
            }
            curSum += *it;
            if (curSum < minSum)
            {
                minSum = curSum;
            }
            if (curSum > 0)
            {
                curSum = 0;
            }
        }
        return minSum;
    }
};