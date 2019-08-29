package Leetcode.src.test;

import Leetcode.src.RotateString;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;


class RotateStringTest {
    // abcde
    static Map<String,Boolean> test1 = new HashMap<>();
    //ab
    static Map<String,Boolean> test2 = new HashMap<>();
    //a
    static Map<String,Boolean> test3 = new HashMap<>();
    //null
    static Map<String,Boolean> test4 = new HashMap<>();

   @BeforeAll
    static void setupTestCa(){
        //test1: abced
        test1.put("cdeab",true);
        test1.put("abced",false);
        test1.put("abced",true);
        //test2: ab
        test2.put("ba",true);
        test2.put("bc",false);
        test2.put("fr",false);
        //test3: a
        test3.put("abc",false);
        test3.put("a",true);
        //test4 : ""
        test4.put("",true);
        test4.put("abs",false);
    }


    @Test
    static void rotateString() {
        RotateString rs = new RotateString();
        //test1 :"abced"
        for (String key:test1.keySet()){
            assertEquals(rs.rotateString("abcde",key),test1.get(key),"Testing case1");
        }
        //test2 :"ab"
        for (String key:test2.keySet()){
            assertEquals(rs.rotateString("ab",key),test2.get(key),"Testing case2");
        }
        //test1 :"a"
        for (String key:test3.keySet()){
            assertEquals(rs.rotateString("a",key),test3.get(key),"Testing case3");
        }
        //test1 :""
        for (String key:test1.keySet()){
            assertEquals(rs.rotateString("",key),test4.get(key),"Testing case4");
        }



    }
}