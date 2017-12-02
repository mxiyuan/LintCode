class Solution
{
  public:
    /*
     * @param a: a number
     * @param b: a number
     * @return: the result
     */
    string addBinary(string &a, string &b)
    {
        string result;
        int resultLength = max(a.length(), b.length());

        int carry = 0;
        for (int i = 0; i < resultLength; ++i)
        {
            int aBit = i < a.length() ? a[a.length() - 1 - i] - '0' : 0;
            int bBit = i < b.length() ? b[b.length() - 1 - i] - '0' : 0;
            int sum = aBit + bBit + carry;
            carry = sum / 2;
            sum %= 2;
            result.push_back('0' + sum);
        }
        if (carry)
        {
            result.push_back('0' + carry);
        }
        reverse(result.begin(), result.end());

        return result;
    }
};
