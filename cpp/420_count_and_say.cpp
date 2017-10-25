class Solution {
public:
    /*
     * @param n: the nth
     * @return: the nth sequence
     */
    string countAndSay(int n) {
        string seq{"1"};
        for(int i = 0; i < n - 1; ++i)
        {
            seq = getNext(seq);
        }
        return seq;
    }

private:
    string getNext(const string &seq) {
        stringstream nextSeq;
        for(int i = 0; i < seq.length(); ++i) {
            int cnt = 1;
            while(i < seq.length() - 1 && seq[i] == seq[i + 1]) {
                ++cnt, ++i;
            }
            nextSeq << cnt << seq[i];
        }
        return nextSeq.str();
    }
};