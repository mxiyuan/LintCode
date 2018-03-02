class Solution {
public:
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    bool isIsomorphic(string &s, string &t) {
        int m1[256] = {0};
        int m2[256] = {0};
        const int len = s.size();
        for (int i = 0; i < len; ++i) {
            if (m1[s[i]] != m2[t[i]]) return false;
            m1[s[i]] = i + 1;
            m2[t[i]] = i + 1;
        }
        return true;
    }
};
