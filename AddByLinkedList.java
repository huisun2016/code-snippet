
public class AddByLinkedList {

    public static LinkedListNode add(LinkedListNode runner1, LinkedListNode runner2) {
        int carry = 0;
        LinkedListNode last = null ;
        LinkedListNode current = null;
        LinkedListNode head = null;
        while (runner1 != null || runner2 != null || carry != 0) {

            int result = 0;
            if (runner1 != null) {
                result = runner1.data;
                runner1 = runner1.next;

            }
           
            if (runner2 != null) {
                result += runner2.data;
                runner2 = runner2.next;
            }
          
            result += carry;
            
            if (result >= 10) {
                result = result % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            if (last == null) {
                last = new LinkedListNode(result, null);
                head = last;

            } else {
                current = new LinkedListNode(result, null);
                last.next = current;
                last = current;
            }

        }
        return head;
    }

    public static void main(String[] args) {
        LinkedListNode a = new LinkedListNode(5, new LinkedListNode(2, new LinkedListNode(9, null)));
        LinkedListNode b = new LinkedListNode(3, null);
        //LinkedListNode c = null;

       // System.out.println(add(a, c));
        
         int i =5;
        int j =6;
        System.out.println(i^i^j);
    }
}
