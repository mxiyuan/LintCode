public class Solution {
    /**
     * @param head: the given linked list
     * @return: the array that store the values in reverse order 
     */
    public List<Integer> reverseStore(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Stack<Integer> stack = new Stack<>();
        while (dummy.next != null) {
            stack.push(dummy.next.val);
            dummy.next = dummy.next.next;
        }
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
