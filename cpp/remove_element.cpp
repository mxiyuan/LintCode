// Time:  O(n)
// Space: O(1)

class Solution
{
  public:
    /**
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    int removeElement(vector<int> &A, int elem)
    {
        auto left = A.begin();
        auto right = A.end();
        while (left < right)
        {
            if (*left != elem)
            {
                ++left;
            }
            else
            {
                swap(*left, *(--right));
            }
        }
        return left - A.begin();
    }
};
