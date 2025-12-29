public class Reverse {
    

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
    //  ListNode temp=head;
    //  int size=0;
    //  while(temp!=null){
    //     size++;
    //     temp=temp.next;
    //  }
    //  int []arr=new int[size];
    //  temp=head;
    //  int i=0;
    //  while(i<arr.length){
    //     arr[i]=temp.val;
    //     temp=temp.next;
    //     i++;
    //  }
    //  int a=left-1;
    //  int b=right-1;
    //  while(a<=b){
    //     int t=arr[a];
    //     arr[a]=arr[b];
    //     arr[b]=t;
    //     a++;
    //     b--;
    //  }
    //  ListNode ans=new ListNode(arr[0]);
    //  ListNode current = ans;

    //     for ( i = 1; i < arr.length; i++) {
    //         current.next = new ListNode(arr[i]);
    //         current = current.next;
    //     }

    //     return ans;

    //optimal

       if(left==right){
            return head;
        }
        //skip the first left-1 nodes
        ListNode current=head;
        ListNode prev=null;
        for(int i=0;current!=null && i<left-1; i++){
           prev=current;
           current=current.next;
        }
        ListNode last =prev;
        ListNode newEnd=current;

        //reverse between left and right
        ListNode next =current.next;
        for(int i=0; current!=null && i<right-left+1;i++){
              current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }else{
            head=prev;
        }
        newEnd.next=current;
        return head;

    }
}
}
