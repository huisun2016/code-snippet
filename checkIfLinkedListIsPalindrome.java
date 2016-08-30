
import java.util.Stack;

public class checkIfLinkedListIsPalindrome {

    public boolean checkIterative(LinkedListNode n) {
        if (n == null) {
            return false;
        }
        if (n.next == null) {
            return true;
        }
        Stack helper = new Stack();
        LinkedListNode slow = null;
        LinkedListNode fast = null;

        while (n.next != null && n != null) {
            helper.push(slow);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (n.next == null) {
            slow = slow.next;
        }
        while (slow.next != null) {
            if (((LinkedListNode) helper.pop()).data != slow.data) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static class Result {

        boolean res = false;
        LinkedListNode toCompare;

        public Result(boolean res, LinkedListNode toCompare) {
            this.res = res;
            this.toCompare = toCompare;
        }
    }

    public static Result checkRecursive(LinkedListNode n, int len) {
        boolean res = false;
       
        if (len == 2) {
            LinkedListNode nextNode = n.next;
            if (n.data == nextNode.data) {
                res = true;
            }       
            return new Result(res, nextNode.next);
        }
        if(len==1){
            return new Result(true, n.next);
        }
         
        Result result = checkRecursive(n.next, len-2);
        if(result.res&&result.toCompare.data==n.data) {
            return new Result(true, result.toCompare.next);     
        }
       return new Result(false, null);
    }

    public static void main(String[] args) {
       //LinkedListNode a = new LinkedListNode(2, new LinkedListNode(2, new LinkedListNode(3, new LinkedListNode(2, new LinkedListNode(1, null)))));
      // LinkedListNode b = new LinkedListNode(10, new LinkedListNode(2, new LinkedListNode(3, new LinkedListNode(3, new LinkedListNode(2, new LinkedListNode(1, null))))));
       //checkIfLinkedListIsPalindrome checker = new checkIfLinkedListIsPalindrome();
       
       //Result result = checkRecursive(b, 6);
       //System.out.println(result.res);
       
    }
}
