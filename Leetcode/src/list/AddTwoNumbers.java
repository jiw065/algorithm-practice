package Leetcode.src.list;

class AddTwoNumbers  {
	    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       if (l1 == null && l2==null){
	           return null; 
	       }
	       if (l1==null && l2!=null) return addTwoNumbers(l2, l1); 


	        int v1 = l1.val;
	        int v2 = l2==null?0:l2.val; 
	        int sum = v1+v2;
	       
	        
	         ListNode node = null;
	        if (sum < 10){
	            node = new ListNode(sum);
	            if(l2!=null){
	                 node.next = addTwoNumbers(l1.next, l2.next); 
	            }else{
	                 node.next = addTwoNumbers(l1.next, null); 
	            }
	           
	        }else{
	            sum = sum -10;
	            node = new ListNode(sum);
	            if (l2 != null){
	                 if(l1.next != null){
	                    l1.next.val += 1; 
	                    node.next = addTwoNumbers(l1.next, l2.next); 
	                }else if(l2.next !=null){
	                    l2.next.val += 1; 
	                    node.next = addTwoNumbers(l1.next, l2.next); 
	                }else{
	                    node.next =  new ListNode(1);
	                }
	            }else{
	                if(l1.next != null){
	                    l1.next.val += 1; 
	                    node.next = addTwoNumbers(l1.next,null); 
	                }else{
	                    node.next =  new ListNode(1);
	                } 
	            }
	           
	           
	        }

	        return node; 
	        
	    }
}
