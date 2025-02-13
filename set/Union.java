package org.example.set;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(12);
        s1.add(13);
        s1.add(15);

        Set<Integer> s2 = new HashSet<>();
        s2.add(10);
        s2.add(12);
        s2.add(17);
        s2.add(16);

       Set<Integer> i = new HashSet<>(s1);
       Set<Integer> u = new HashSet<>(s1);
       i.retainAll(s2);
        System.out.println( "Intersection is " + i);
        u.addAll(s2);
        System.out.println("Union is : " + u);
    }
}
