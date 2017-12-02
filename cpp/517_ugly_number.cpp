class Solution
{
  public:
    /*
     * @param num: An integer
     * @return: true if num is an ugly number or false
     */
    bool isUgly(int num)
    {
        if (num < 1)
        {
            return false;
        }
        for (const auto n : {2, 3, 5})
        {
            while (num % n == 0)
            {
                num /= n;
            }
        }
        return n == 1;
    }
};
