class StringUtils {
public:
    /*
     * @param originalStr: the string we want to append to
     * @param size: the target length of the string
     * @param padChar: the character to pad to the left side of the string
     * @return: A string
     */
    static string leftPad(string &originalStr, int size, char padChar=' ') {
        return string(max(0, size - static_cast<int>(originalStr.length())),
                      padChar).append(originalStr);
    }
};
