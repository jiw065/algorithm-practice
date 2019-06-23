package list;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class PalindromeLinkedList {
	public boolean isPalindromeSlow(ListNode head) {
	       if (head == null || head.next == null){
	           return true; 
	       }
	        
	       LinkedList<Integer> ll = new LinkedList<>(); 
	       ListNode cur = head;  
	       while(cur !=null ){
	           ll.add(cur.val);           
	           cur = cur.next;
	       }
	        
	       int len = ll.size()/2;
	       while(len >0){
	           int left = ll.pollFirst();
	           int right = ll.pollLast();
	           if (left != right){
	               return false;
	           }
	           len--;
	       } 
	        
	        return true; 
	               
	    }
	
	//NOTE!!!! NEED TO KNOW HOW TO REVERSE LINKEDLIST
	  public ListNode reverse(ListNode node){
	        ListNode prev = null; 
	        ListNode cur = node; 
	      //  1->2->3 
	        while(cur != null ){
	            ListNode temp = cur.next;  // temp  = 2/ temp = 3/null  
	            cur.next = prev;  //1-> null / 2->1/3->2
	            prev = cur;  //prev = 1 /prev =2 /prev =3 
	            cur = temp; //cur = 2/ cur = 3 /cur =null 
	          
	        }
	        
	        return prev; 
	    }
	    
	    
	    
	    public boolean isPalindromeFast(ListNode head) {
	       if (head == null){
	           return true; 
	       }
	        
	      ListNode fast = head, slow = head;
	      boolean isOdd = false; 
	      
	      // put the slow in the middle and fast to the end  
	      //  1 2 2 1 null :  fast is null. slow is second 2  
	      //  1 2 3 2 1  : fast is last 1, slow is 3
	      
	      while (fast !=null && fast.next != null ){
	          fast = fast.next.next;
	          slow = slow.next;
	                   
	      }  
	     
	        // example  1 2 3 2 1 move slow from 3 to 2(4th)
	       if(fast != null){
	           slow = slow.next; 
	       } 
	       //reverse right half
	        slow =  reverse(slow);
	        fast = head;
	        
	        //compare reversed list
	        while(slow!=null){
	            if (slow.val != fast.val){
	                return false; 
	            }
	            slow = slow.next;
	            fast = fast.next; 
	            
	        }
	        
	        
	        
	       return true;  
	        
	    }
}
