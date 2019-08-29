package Leetcode.src.string;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class RotatingString{

    public boolean rotateString(String A, String B) {
        if((A==null || B ==null)||(A.length() != B.length())) return false;
        if (A.length() ==0 && B.length() == 0) return true;

        String C = A+A;
        return C.contains(B);
    }


    public boolean rotateString2(String A, String B) {
        if(A==null || B ==null) return false;
        if (A.length() != B.length()){
            return false;
        }

        if (A.length() ==0 && B.length() == 0) return true;

        // covert string to linkedlist
        ///A.chars() -> input stream
        LinkedList<Character> Alist = A.chars().mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedList::new));
        LinkedList<Character> Blist = B.chars().mapToObj(c->(char)c).collect(Collectors.toCollection(LinkedList::new));
        //char[] AList = A.toCharArray();
        //char[] BList = B.toCharArray();

        //Deque<Character> Bl = Blist;
        if(Alist.containsAll(Blist)) {
            char e = Blist.peekFirst();
            char t = Blist.peekLast();
            int s = 0;
            while ((!Alist.peekFirst().equals(e) || !Alist.peekLast().equals(t))&& s<A.length() ) {
                Blist.addLast(Blist.pollFirst());
                e = Blist.peekFirst();
                t = Blist.peekLast();
                s++;
            }

            for (int i = 0; i < A.length(); i++) {
                if (!Alist.get(i).equals(Blist.get(i))) {
                    return false;
                }
            }
        }else{
            return false;
        }

        //System.out.println(Alist.containsAll(Blist));
        return true;


    }

}
