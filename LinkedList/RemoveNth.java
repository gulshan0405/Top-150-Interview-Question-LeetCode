public class RemoveNth {
    
 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        count = count - n + 1;
        int prvCnt = count - 1;
        temp = head;
        if (count == 1) {
            return head.next;
        }
        while (count > 1) {
            temp = temp.next;
            count--;
        }
        ListNode prev=head;
        while( prvCnt>1) {
            prev=prev.next;
            prvCnt--;
        }
        prev.next=temp.next;
        return head;
        
    }
}
}
