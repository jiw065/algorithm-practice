package hashset;

public class LinkedListCycle {
	public boolean hasCycle2(ListNode head) {
	    Set<ListNode> nodesSeen = new HashSet<>();
	    while (head != null) {
	        if (nodesSeen.contains(head)) {
	            return true;
	        } else {
	            nodesSeen.add(head);
	        }
	            head = head.next;
	    }
	        return false;
	    }
	    
	    public boolean hasCycle(ListNode head) {
	        if(head == null || head.next==null){
	            return false; 
	        }
	        ListNode fast = head.next;
	        ListNode slow = head; 
	        /**
	            the two pointers will meet; The fast runner is just one step behind the slow runner. In the next iteration,                they both increment one and two steps respectively and meet each other.
	        **/
	        while(slow !=fast ){
	            if(fast ==null || fast.next ==null){ // if fast reach out to null, means there is no cycle
	                return false;
	            }
	            slow = slow.next;
	            fast = fast.next.next; 
	        }
	        
	        return true; 
	    }
}
