package org.example.list;
import java.util.*;

import java.util.ArrayList;
import java.util.Collection;

public class ReverseList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(14);
        list.add(12);
        list.add(11);

        System.out.println("By ArrayList : ");
        System.out.println("List before sort : > " + list);
        Collections.sort(list);
        System.out.println("List after sort : > " + list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.add(13);
        list2.add(14);
        list2.add(12);
        list2.add(11);

        System.out.println("By LinkedList");
        System.out.println("LinkedList before sort : " + list2);
        Collections.sort(list2);
        System.out.println("LinkedList after sort : " + list2);
    }



}
