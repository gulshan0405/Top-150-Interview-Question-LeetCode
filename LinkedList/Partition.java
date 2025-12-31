public class Partition {
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode small=dummy1;
        ListNode large=dummy2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
               small.next=temp;
                small=small.next;
            }else{
               large.next=temp;
               large=large.next;
            }
            temp=temp.next;
        }
        large.next=null;
        small.next=dummy2.next;
        return dummy1.next;

    }
}
}
