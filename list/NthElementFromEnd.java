package org.example.list;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class NthElementFromEnd {

    public static String element(LinkedList<String> l, int position) {
        Iterator<String> first = l.iterator();
        Iterator<String> second = l.iterator();

        for (int i = 0; i < position; i++) {
            if (first.hasNext()) {
                first.next();
            } else {
                return null;
            }
        }

        while (first.hasNext()) {
            first.next();
            second.next();
        }
        return second.next();
    }


    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int position = 2;
        System.out.println(NthElementFromEnd.element(list, position));
    }

}