package ctci;

//SinglyLinkedList
public class Node {

    public Object data;
    public Node next;

    public Node(Object o) {
        this.data = o;
        next = null;
    }

    public void addToTail(Object o) {
        Node runner = this;

        while (runner.next != null) {
            runner = runner.next;
        }
        runner.next = new Node(o);
    }

    public Node deleteNode(Object o) {
        if (o == null) {
            return null;
        }
        if (this.data.equals(o)) {
            return this.next;
        }
        Node runner = this;
        
        while (runner.next != null) {
            if (runner.next.data.equals(o)) {
                runner.next = runner.next.next;
                return this;
            }
            runner = runner.next;
        }
        return this;
    }

    public static void main(String[] args) {
    }
}
