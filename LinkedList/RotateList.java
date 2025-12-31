public class RotateList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            // if (head == null || head.next == null || k == 0) {
            // return head;
            // }
            // ListNode last = head;
            // int length = 0;
            // while (last != null) {
            // length++;
            // last = last.next;
            // }
            // int rotation = k % length;
            // while(rotation>0){
            // ListNode Slast = head;
            // last=head;
            // while (last.next != null) {
            // last = last.next;
            // }
            // while (Slast.next.next != null) {
            // Slast = Slast.next;
            // }
            // last.next = head;
            // Slast.next = null;
            // head = last;
            // rotation--;
            // }
            // return head;

            if (head == null || head.next == null || k == 0) {
                return head;
            }

            ListNode last = head;
            int length = 1;

            while (last.next != null) {
                last = last.next;
                length++;
            }

            k = k % length;
            if (k == 0)
                return head;

            last.next = head; // make circular

            int stepsToNewHead = length - k;
            ListNode newLast = head;

            for (int i = 1; i < stepsToNewHead; i++) {
                newLast = newLast.next;
            }

            ListNode newHead = newLast.next;
            newLast.next = null;

            return newHead;
        }
    }
}
