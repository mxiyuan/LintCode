class Solution
{
  public:
    /**
     * @param nums: A list of integers
     * @return: A integer indicate the sum of max subarray
     */
    int maxSubArray(vector<int> nums)
    {
        int maxSum = 0;
        int curSum = 0;
        for (auto it = nums.begin(); it != nums.end(); ++it)
        {
            if (it == nums.begin())
            {
                maxSum = *it;
            }
            curSum += *it;
            if (curSum > maxSum)
            {
                maxSum = curSum;
            }
            if (curSum < 0)
            {
                curSum = 0;
            }
        }
        return maxSum;
    }
};
