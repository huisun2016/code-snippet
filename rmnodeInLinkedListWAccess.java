
public class rmnodeInLinkedListWAccess {
   
    public void remove(LinkedListNode node){
        if(node ==null) return;
        if(node.next!=null){
        node.data = node.next.data;
        node.next = node.next.next;
        }
    }
}
