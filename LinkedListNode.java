
class LinkedListNode {
    LinkedListNode next;
    int data;

    LinkedListNode(int result,  LinkedListNode n) {
        this.data = result;
        this.next = n;
    }
    public String toString(){
        StringBuffer result = new StringBuffer(this.data+"");
        LinkedListNode runner = this.next;
        while(runner!= null){
            //System.out.println(runner.data);
            result.append(" "+runner.data);
            runner = runner.next;
        }
        return result.toString();
    }
}
