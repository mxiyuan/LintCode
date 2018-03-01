class Solution {
public:
    /*
     * @param character: a character
     * @return: a character
     */
    char lowercaseToUppercase(char character) {
        const int diff = 'a' - 'A';
        return static_cast<char>(character - diff);
    }
};
