
import java.util.Stack;

public class ReverseLinkedList2 {

    private static Node reverse(Node head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        Stack st = new Stack();
        Node current = head;
        while (current.next != null) {
            st.push(current);
            current = current.next;
        }
        st.push(current);
        Node newHead = (Node) st.pop();
        current = newHead;
        while (!st.isEmpty()) {
            current.next = (Node) st.pop();
            current = current.next;
        }
        current.next = null;
        return newHead;
    }

    static class Node {

        int content;
        Node next;

        public Node(int content, Node next) {
            this.content = content;
            this.next = next;
        }

        public String toString() {
            return (" " + content);
        }
    }

    public static void main(String[] args) {
        SwapEveryTwoNodeInLinkedList newReverse = new SwapEveryTwoNodeInLinkedList();
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));
        Node newHead = reverse(head);
        System.out.println(newHead);
        System.out.println(newHead.next);
        System.out.println(newHead.next.next);
        System.out.println(newHead.next.next.next);
        System.out.println(newHead.next.next.next.next);
//        System.out.println(newHead.next.next.next.next.next);

    }
}