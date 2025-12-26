import java.util.HashMap;
import java.util.HashSet;

public class AddTwoNumber {
     static public class LL{
    private ListNode head;
    private int size;

    public LL(){
        size=0;
    }
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0); // placeholder for the result
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            
            if (l1 != null) {
                sum += l1.value;
                l1 = l1.next;
            }
            
            if (l2 != null) {
                sum += l2.value;
                l2 = l2.next;
            }
            
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        
        return dummy.next;
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
