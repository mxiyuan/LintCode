class Solution {
public:
    /**
     * @param n: An integer
     * @return: An integer
     */
    int climbStairs(int n) {
        if(n < 1) return 0;
        array<int, 3> steps{1, 1, 2};
        for(int i = 2; i <= n; ++i) {
            steps[i % 3] = steps[(i - 1) % 3] + steps[(i - 2) % 3];
        }
        return steps[n % 3];
    }
};
