class Solution {
public:
    /*
     * @param x: An integer
     * @return: The sqrt of x
     */
    int sqrt(int x) {
        if(x == 0) {
            return 0;
        }
        int left = 1;
        int right = x;
        while(left <= right) {
            int mid = (left + right) / 2;
            if(mid > x / mid) {
                right = mid - 1;
            } else if(mid < x / mid) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
    }
};