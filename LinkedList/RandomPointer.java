import java.util.HashMap;


public class RandomPointer {
    public class LL{
     private int head;

      public Node copyRandomList(Node head) {
      Node temp = head;
      HashMap<Node,Node>map=new HashMap<>();
     while(temp!=null){
       Node copyNode=new Node(temp.val);
        map.put(temp,copyNode);
        temp=temp.next;
     }
      temp=head;
      Node copyNode=new Node(0);
      while(temp!=null){
        copyNode=map.get(temp);
        copyNode.next=map.get(temp.next);
        copyNode.random=map.get(temp.random);
        temp=temp.next;
      }
      return map.get(head);
    }
      public Node copyRandomListOp(Node head) {
     Node temp = head;
        while (temp != null) {
            Node node = new Node(temp.val);
            node.next = temp.next;
            temp.next = node;
            temp = node.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.random!= null) {
                temp.next.random = temp.random.next;
            }
                temp = temp.next.next;
        }
        Node dummy = new Node(-1);
        Node res = dummy;
        temp = head;
        while (temp != null) {
            res.next = temp.next;
            temp.next = temp.next.next;
              res = res.next;
              temp=temp.next;
        }
        return dummy.next;
    }
    public class Node{
        private int val;
        private Node next;
        private Node random;
        public Node(int value){
            this.val=value;
        }
        public Node(int value,Node next,Node random){
            this.val=value;
            this.next=next;
            this.random=random;
        }
    }
    }
}
