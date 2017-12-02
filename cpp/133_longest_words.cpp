class Solution
{
  public:
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    vector<string> longestWords(vector<string> &dictionary)
    {
        vector<string> longestWords;
        for (const auto &word : dictionary)
        {
            if (!longestWords.empty() && word.length() > longestWords[0].length())
            {
                longestWords = move(vector<string>{word});
            }
            else if (longestWords.empty() || word.length() == longestWords[0].length())
            {
                longestWords.push_back(word);
            }
        }
        return longestWords;
    }
};
