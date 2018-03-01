/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */


public class Solution {
    /*
     * @param head: the first node of linked list.
     * @return: An integer
     */
    public int countNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        while(dummy.next != null) {
            count++;
            dummy.next = dummy.next.next;
        }
        return count;
    }
}
