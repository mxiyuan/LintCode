// Time:  O(n)
// Space: O(n)

class Solution {
public:
    /*
     * @param tokens: The Reverse Polish Notation
     * @return: the value
     */
    int evalRPN(vector<string> tokens) {
        if (tokens.empty()) {
            return 0;
        }
        stack<int> s;

        std::function<bool(const string &)> is_operator = [](const string &op) -> bool {
            return op.length() == 1 && string("+-*/").find(op) != string::npos;
        };

        for (const auto& tok : tokens) {
            if (!is_operator(tok)) {
                s.emplace(stoi(tok));
            } else {
                int y = s.top();
                s.pop();
                int x = s.top();
                s.pop();
                if (tok[0] == '+') {
                    x += y;
                } else if (tok[0] == '-') {
                    x -= y;
                } else if (tok[0] == '*') {
                    x *= y;
                } else {
                    x /= y;
                }
                s.emplace(x);
            }
        }
        return s.top();
    }
};
