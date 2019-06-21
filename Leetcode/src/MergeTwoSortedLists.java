
public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2!=null){
            return l2;
        }else if(l1 != null && l2==null){
            return l1;
        }else if (l1 == null && l2==null){
            return null; 
        }
        List next1 = l1.next;
        ListNode next2 = l2.next;
        ListNode returnNode; 
        if(l1.val <= l2.val){
          l1.next = mergeTwoLists(next1, l2); 
          returnNode = l1; 
        }else{
           l2.next = mergeTwoLists(l1, next2);
           returnNode = l2; 
        }
        
        return returnNode; 
    }
}
