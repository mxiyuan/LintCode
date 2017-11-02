class Solution {
public:
    /*
     * @param n: An integer
     * @return: true if this is a happy number or false
     */
    bool isHappy(int n) {
        unordered_set<int> visited;

        auto nextNumber = [](int num) -> int {
            int sum = 0;
            while(num) {
                int rem = num % 10;
                sum += rem * rem;
                num /= 10;
            }
            return sum;
        };
        
        while(n != 1 && !visited.count(n)) {
            visited.emplace(n);
            n = nextNumber(n);
        }
        return n == 1;
    }
};
