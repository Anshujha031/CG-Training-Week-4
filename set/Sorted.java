package org.example.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sorted {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(5);
        s1.add(3);
        s1.add(9);
        s1.add(1);
        Set<Integer> s2 = new TreeSet<>();
        s2.addAll(s1);
        System.out.println(s2);

    }
}
