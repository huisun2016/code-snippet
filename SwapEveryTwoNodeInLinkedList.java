
public class SwapEveryTwoNodeInLinkedList {
    
    private static Node swap(Node head){
       
      if (head == null) {
            return null;
        }
      if(head.next ==null) {
          return head;
      }
      Node newHead = head.next;
      Node slow = head;
      Node fast = head.next;
 
       while(fast.next!= null&&fast.next.next!= null){
        // System.out.println("here " + fast.content +" "+slow.content);
           Node temp = fast.next;
           fast.next = slow;
           slow.next = temp.next;
           
           slow = temp;
           fast = temp.next;
    }        
       if(fast.next!= null&&fast.next.next == null){
           Node temp = fast.next;
           fast.next= slow;
           slow.next = temp;
       
       }
       else{
           fast.next = slow;
           slow.next = null;
       }
       return newHead;
    }
        
     static class Node{
        int content;
        Node next;     
        public Node(int content, Node next){
            this.content = content;
            this.next = next;
        }
         
        public String toString(){
            return (" "+content );
        }
     }
    
    public static void main(String[] args){
        SwapEveryTwoNodeInLinkedList newReverse = new SwapEveryTwoNodeInLinkedList();
        Node head  = new Node(1, new Node(2, new Node(3,new Node(4, new Node(5, null)))));
        Node newHead = swap(head);
        System.out.println(newHead);
        System.out.println(newHead.next);
        System.out.println(newHead.next.next);
        System.out.println(newHead.next.next.next);
        System.out.println(newHead.next.next.next.next);
        System.out.println(newHead.next.next.next.next.next);
        
}
}