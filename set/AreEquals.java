package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class AreEquals {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(11);
        s1.add(12);
        s1.add(13);
        Set<Integer> s2 = new HashSet<>();
        s2.add(10);
        s2.add(11);
        s2.add(12);
        s2.add(13);

        if(s1.equals(s2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
