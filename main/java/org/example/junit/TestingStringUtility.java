package org.example.junit;

public class TestingStringUtility {

    static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

    static Boolean isPlindrome(String s){
        String r = new StringBuilder(s).reverse().toString();
        if(s.equals(r)){
            return true;
        }
        return false;
    }

    static String toUppercase(String s){
        return s.toUpperCase();
    }
}
