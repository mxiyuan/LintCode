/**
 * Definition of ListNode
 * class ListNode {
 * public:
 *     int val;
 *     ListNode *next;
 *     ListNode(int val) {
 *         this->val = val;
 *         this->next = NULL;
 *     }
 * }
 */


class Solution {
public:
    /*
     * @param head: the first node of linked list.
     * @return: An integer
     */
    int countNodes(ListNode * head) {
        ListNode dummy(0);
        dummy.next = head;
        int count = 0;
        while(dummy.next) {
            count++;
            dummy.next = dummy.next->next;
        }
        return count;
    }
};
