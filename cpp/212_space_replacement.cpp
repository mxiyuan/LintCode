class Solution {
public:
    /*
     * @param string: An array of Char
     * @param length: The true length of the string
     * @return: The true length of new string
     */
    int replaceBlank(char *str, int length) {
        const array<char, 3> to{'%', '2', '0'};

        int spaceCount = 0;
        for (int i = 0; i < length; ++i) {
            if (str[i] == ' ') {
                ++spaceCount;
            }
        }

        const int newLength = length + (static_cast<int>(to.size()) - 1) * spaceCount;
        for (int i = length - 1, j = newLength - 1; i >= 0; --i) {
            if (str[i] == ' ') {
                int k = to.size() - 1;
                while(k >= 0) {
                    str[j--] = to[k--];
                }
            } else {
                str[j--] = str[i];
            }
        }
        
        return newLength;
    }
};
