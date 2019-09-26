package Leetcode.src.list;

import java.util.ArrayList;
import java.util.List;

public class MiddleoftheLinkedList{
    public class ListNode {
     int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    // brute force
    public ListNode middleNode1(ListNode head) {
        if (head.next == null) return head;
        ListNode cur = head;
        List<ListNode> al = new ArrayList<>();
        al.add(cur);
        int len = 1;

        while(cur.next != null){
            cur = cur.next;
            al.add(cur);
            len++;
        }

        int mid = len%2==0 ? len/2 : len/2+1;

        return al.get(mid);

    }

    //two pointers
    public ListNode middleNode(ListNode head) {
        if (head.next == null) return head;
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;

    }

}
