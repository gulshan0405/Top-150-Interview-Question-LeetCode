public class MergeSorted {
     static public class LL{
   
         public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;

        while(list1!=null&&list2!=null){
            if(list1.value<=list2.value){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                  temp.next=list2;
                list2=list2.next;
            }
              temp=temp.next;
            }
        if(list1!=null){
            temp.next=list1;
        }
        if(list2!=null){
            temp.next=list2;
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
