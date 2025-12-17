import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class CheckCycle {
   
   static public class LL{
    private ListNode head;
    private int size;

    public LL(){
        size=0;
    }

      public boolean hasCycle(ListNode head) {

        //optimal approach
        // ListNode fast=head;
        // ListNode slow=head;

        // while(fast!=null && fast.next!=null){
        //     fast=fast.next.next;
        //     slow=slow.next;
        //     if(fast==slow){
        //         return true;
        //     }
        // }
        // return false;

        //non-optimal approach
        HashSet<ListNode> map=new HashSet<>();
        ListNode node=head;
        while(node!=null){
            if(!map.contains(node)){
               map.add(node);
               node=node.next;
            }else{
                return true;
            }
        }
        return false;
    }

    private class ListNode{
        private int value;
        private ListNode next;

        public ListNode(int value){
            this.value=value;
        }
        public ListNode(int value,ListNode next){
            this.value=value;
            this.next=next;
        }
    }
   }

}
