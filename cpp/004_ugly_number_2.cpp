// Time:  O(n)
// Space: O(1)

// Heap solution.
class Solution {
public:
    /*
     * @param n: The number n.
     * @return: The nth prime number as description.
     */
    long long nthUglyNumber(int n) {
        long long uglyNumber = 0;
        priority_queue<long long, vector<long long>, greater<long long>> heap;

        heap.emplace(1);
        for (int i = 0; i < n; ++i) {
            uglyNumber = heap.top();
            heap.pop();
            if (uglyNumber % 2 == 0) {
                heap.emplace(uglyNumber * 2);
            } else if (uglyNumber % 3 == 0) {
                heap.emplace(uglyNumber * 2);
                heap.emplace(uglyNumber * 3);
            } else {
                heap.emplace(uglyNumber * 2);
                heap.emplace(uglyNumber * 3);
                heap.emplace(uglyNumber * 5);
            }
        }
        return uglyNumber;
    }
};

// BST solution.
class Solution2 {
public:
    /*
     * @param n: The number n.
     * @return: The nth prime number as description.
     */
    long long nthUglyNumber(int n) {
        long long uglyNumber = 0;
        set<long long> bst;

        bst.emplace(1);
        for (int i = 0; i < n; ++i) {
            uglyNumber = *bst.cbegin();
            bst.erase(bst.cbegin());
            if (uglyNumber % 2 == 0) {
                bst.emplace(uglyNumber * 2);
            } else if (uglyNumber % 3 == 0) {
                bst.emplace(uglyNumber * 2);
                bst.emplace(uglyNumber * 3);
            } else {
                bst.emplace(uglyNumber * 2);
                bst.emplace(uglyNumber * 3);
                bst.emplace(uglyNumber * 5);
            }
        }
        return uglyNumber;
    }
};

// Time:  O(n)
// Space: O(n)
// DP solution.
//尚未测试
class Solution3 {
public:
    /*
     * @param n: The number n.
     * @return: The nth prime number as description.
     */
    long long nthUglyNumber(int n) {
        vector<long long> uglies(n + 1);
        uglies[0] = 1;
    
        long long f2 = 2, f3 = 3, f5 = 5;
        int idx2 = 0, idx3 = 0, idx5 = 0;
    
        for (int i = 1; i <= n; ++i) {
            long long min_val = min(min(f2, f3), f5);
            uglies[i] = min_val;
    
            if (min_val == f2) {
                f2 = 2 * uglies[++idx2];
            }
            if (min_val == f3) {
                f3 = 3 * uglies[++idx3];
            }
            if (min_val == f5) {
                f5 = 5 * uglies[++idx5];
            }
        }

        return uglies[n];
    }
};
