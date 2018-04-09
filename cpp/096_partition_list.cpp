// Time:  O(n)
// Space: O(1)

class Solution {
  public:
    /**
     * @param head: The first node of linked list.
     * @param x: an integer
     * @return: a ListNode
     */
    ListNode *partition(ListNode *head, int x) {
        ListNode dummySmaller(0);
        ListNode dummyLarger(0);
        auto smaller = &dummySmaller;
        auto larger = &dummyLarger;

        while (head) {
            if (head->val < x) {
                smaller->next = head;
                smaller = smaller->next;
            } else {
                larger->next = head;
                larger = larger->next;
            }
            head = head->next;
        }
        smaller->next = dummyLarger.next;
        larger->next = nullptr;

        return dummySmaller.next;
    }
};
