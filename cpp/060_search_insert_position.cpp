// Time:  O(logn)
// Space: O(1)

class Solution
{
    /**
     * param A : an integer sorted array
     * param target :  an integer to be inserted
     * return : an integer
     */
  public:
    int searchInsert(vector<int> &A, int target)
    {
        int left = 0;
        int right = A.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (target < A[mid])
            {
                right = mid - 1;
            }
            else if (A[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                return mid;
            }
        }

        return left;
    }
};

class Solution2
{
  public:
    int searchInsert(vector<int> &A, int target)
    {
        return lower_bound(A.begin(), A.end(), target) - A.begin();
    }
};
