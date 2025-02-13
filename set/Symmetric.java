package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class Symmetric {
    public static void main(String[] args) {


        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        Set<Integer> s2 = new HashSet<>();
        s2.add(3);
        s2.add(4);
        s2.add(5);
        Set<Integer> i = new HashSet<>(s1);
        Set<Integer> u = new HashSet<>(s1);
        i.retainAll(s2);
        u.addAll(s2);
        u.removeAll(i);
        System.out.println(u);


    }
}
