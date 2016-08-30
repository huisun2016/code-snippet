
public class DedupLinkedlistWoBuffer {

    public void remove(LinkedListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        LinkedListNode current = head;
        while (current.next != null) {
            LinkedListNode runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
