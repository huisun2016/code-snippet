
public class KthToLastInLinkedList {

    public LinkedListNode find(LinkedListNode head, int k) {
        if (head == null) {
            return null;
        }
        LinkedListNode fast = head;
        LinkedListNode slow = head;
        for (int i = 1; i < k; i++) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;

        }
        return slow;
    }
}