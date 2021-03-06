// Time:  O(n)
// Space: O(1)

class Solution
{
  public:
    /**
     * @param s : A string
     * @return : A string
     */
    string reverseWords(string s)
    {
        // Reverse the whole string first.
        reverse(s.begin(), s.end());

        std::string::size_type begin = 0, end = 0, len = 0;
        while ((begin = s.find_first_not_of(" ", end)) != string::npos)
        {
            if ((end = s.find(" ", begin)) == string::npos)
            {
                end = s.length();
            }
            // Reverse each word in the string.
            reverse(s.begin() + begin, s.begin() + end);

            // Shift the word to avoid extra space.
            move(s.begin() + begin, s.begin() + end, s.begin() + len);
            len += end - begin;
            if (len < s.length())
            {
                s[len++] = ' ';
            }
        }
        s.resize(len ? len - 1 : 0);
        return s;
    }
};
