package Leetcode.src.string;

public class RotatingString{

    public boolean rotateString(String A, String B) {
        if((A==null || B ==null)||(A.length() != B.length())) return false;
        if (A.length() ==0 && B.length() == 0) return true;

        String C = A+A;
        return C.contains(B);
    }
}
