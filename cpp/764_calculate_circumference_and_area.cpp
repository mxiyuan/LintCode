class Solution {
public:
    /**
     * @param r: a Integer represent radius
     * @return: the circle's circumference nums[0] and area nums[1]
     */
    vector<double> calculate(int r) {
        const double PI = 3.14;
        vector<double> v;
        v.push_back(2 * PI * r);
        v.push_back(PI * r * r);
        return v;
    }
};
