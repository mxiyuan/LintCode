class Solution
{
  public:
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    void mergeSortedArray(int A[], int m, int B[], int n)
    {
        // write your code here
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (k > i)
        {
            if (A[i] < B[j])
            {
                A[k--] = B[j--];
            }
            else
            {
                A[k--] = A[i--];
            }
        }
    }
};