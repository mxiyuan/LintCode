class Solution {
public:
    /**
     * @param str: a string
     * @param offset: an integer
     * @return: nothing
     */
    void rotateString(string &str, int offset) {
        if (!str.empty()) {
            offset %= str.length();
            reverse(str.begin(), str.begin() + str.length() - offset);
            reverse(str.begin() + str.length() - offset, str.end());
            reverse(str.begin(), str.end());
        }
    }
};
