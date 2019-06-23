package list;

public class IntersectionofTwoLinkedLists {
	/* 
    public ListNode reverse(ListNode node){
        ListNode prev = null;
        while (node != null){
            ListNode temp = node.next; //temp = 2
            node.next = prev; //1->null
            prev = node; //prev = 1->null          
            node = temp; // node 2  
        }
        return prev; 
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        headA = reverse(headA);
        headB = reverse(headB);
        while (headA!=null && headB!=null){
            if(headA.val == headB.val){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
            
        }
        
        return null; 
    }
    */
    //brute

/*
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA), lenB = length(headB);
        if (lenA < lenB) return getIntersectionNode(headB, headA);
        ListNode cur = headB; 
        while (headA!=null){
            while (cur!=null){
                if(headA == cur){
                    return headA;
                }
                cur =cur.next;
            }
            cur = headB; 
            headA=headA.next; 
        }
        
        return null; 
    
    }
    */
       
    private int length(ListNode node) {
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
         int lenA = length(headA), lenB = length(headB);
         if (lenA < lenB) return getIntersectionNode(headB, headA);
        //allign two lists with the same start point  
        while(lenA>lenB){
             
             headA= headA.next;
             lenA--;
         }
        
         while (headA!=null && headB!=null){
            if(headA == headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
            
        }
        
        return null; 
        
    }
    
}
