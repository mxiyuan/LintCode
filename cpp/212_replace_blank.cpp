class Solution {
public:
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    int replaceBlank(string &string, int length) {

        const array<char, 3> to{'%', '2', '0'};

        int spaceCount = 0;
        for (int i = 0; i < length; ++i) {
            if (string[i] == ' ') {
                ++spaceCount;
            }
        }

        const int new_length = length + (static_cast<int>(to.size()) - 1) * spaceCount;
        for (int i = length - 1, j = new_length - 1; i >= 0; --i) {
            if (string[i] == ' ') {
                j -= to.size();
                copy(to.cbegin(), to.cend(), string.begin() + j + 1);
            } else {
                string[j--] = string[i];
            }
        }
        
        return new_length;
    }
};
