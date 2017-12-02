class Solution
{
  public:
    /**
     * @return: The same instance of this class every time
     */
    static Solution *getInstance()
    {
        static Solution *instance = new Solution();
        return instance;
    }

    Solution(const Solution &) = delete;
    Solution &operator=(const Solution &) = delete;

  private:
    Solution() {}
    ~Solution() {}
};
