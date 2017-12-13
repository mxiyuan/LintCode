// Time:  O(n)
// Space: O(1)

class Solution
{
  public:
    /**
     * @param n: an integer
     * @return an integer f(n)
     */
    int fibonacci(int n)
    {
        if (n < 1)
        {
            return 0;
        }

        array<int, 3> fib{0, 1, 1};

        for (int i = 3; i < n; ++i)
        {
            fib[i % 3] = fib[(i - 1) % 3] + fib[(i - 2) % 3];
        }

        return fib[(n - 1) % 3];
    }
};
