class Solution {
public:
    /**
     * @param s: a string
     * @param t: a string
     * @return: true if the characters in s can be replaced to get t or false
     */
    bool isIsomorphic(string &s, string &t) {
        const int len = s.size();
        if(t.size() != len) return false;
        int m1[256] = {0};
        int m2[256] = {0};
        for (int i = 0; i < len; ++i) {
            if (m1[s[i]] != m2[t[i]]) return false;
            m1[s[i]] = i + 1;
            m2[t[i]] = i + 1;
        }
        return true;
    }
};
