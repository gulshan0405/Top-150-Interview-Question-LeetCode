public class RemoveDuplicate {
    
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // HashSet<Integer>set=new HashSet<>();
        // HashSet<Integer>check=new HashSet<>();
        // ListNode temp=head;
        // ArrayList<Integer>arr=new ArrayList<>();
        // ArrayList<Integer>ans=new ArrayList<>();
        // while(temp!=null){
        //     if(!set.contains(temp.val)){
        //        arr.add(temp.val);
        //        set.add(temp.val);
        //     }else{
        //         check.add(temp.val);
        //     }
        //    temp=temp.next;
        // }

        // int i=0;
        // while(i<arr.size()){
        //     if(!check.contains(arr.get(i))){
        //         ans.add(arr.get(i));
        //     }
        //     i++;
        // }
        // ListNode dummy=new ListNode(-1);
        // ListNode curr=dummy;
        // i=0;
        // while(i<ans.size()){
        //     curr.next=new ListNode(ans.get(i));
        //     curr=curr.next;
        //     i++;
        // }
        // return dummy.next;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prev = dummy;

        while (head != null) {

            // check if duplicate sequence starts
            if (head.next != null && head.val == head.next.val) {

                int dupVal = head.val;

                // skip all nodes with this value
                while (head != null && head.val == dupVal) {
                    head = head.next;
                }

                // connect previous to next non-duplicate
                prev.next = head;

            } else {
                // no duplicate, move prev forward
                prev = head;
                head = head.next;
            }
        }

        return dummy.next;

    }
}
}
