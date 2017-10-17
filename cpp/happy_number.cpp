class Solution {
public:
    /*
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    bool isHappy(int n) {
        // write your code here
        function<int, int> nextNumber = [](int num) -> {
            int sum = 0;
            while(num) {
                int rem = num % 10;
                sum += rem * rem;
                num /= 10;
            }
            return sum;
        };
        unordered_set<int> visited;
        while(n != 1 && !visited.count(n)) {
            visited.emplace(n);
            n = nextNumber(n);
        }
        return n == 1;
    }
};

//有错误