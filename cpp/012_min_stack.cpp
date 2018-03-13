class MinStack {
public:
    /*
    * @param a: An integer
    */
    MinStack(int a) {
        // do intialization if necessary
    }

    /*
     * @param number: An integer
     * @return: nothing
     */
    void push(int number) {
        if (elements_.empty()) {
            elements_.emplace(0);
            stack_min_ = number;
        } else {
            elements_.emplace(static_cast<int64_t>(number) - stack_min_);
            if (number < stack_min_) {
                stack_min_ = number; // Update min.
            }
        }
    }

    /*
     * @param a: An integer
     * @return: An integer
     */
    int pop(int a) {
        auto diff = elements_.top();
        elements_.pop();
        if (diff < 0) {
            stack_min_ -= diff; // Restore previous min.
        }
        return stack_min_ + diff;
    }

    /*
     * @param a: An integer
     * @return: An integer
     */
    int min(int a) {
        return stack_min_;
    }
    
private:
    stack<int64_t> elements_;
    int stack_min_;
};