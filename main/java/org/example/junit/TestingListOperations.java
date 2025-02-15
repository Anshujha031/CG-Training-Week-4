package org.example.junit;

import java.util.List;

public class TestingListOperations {

    static void addElement(List<Integer> list,int element){
        list.add(element);

    }

    static boolean removeElement(List<Integer>list,int element){
        return list.remove(Integer.valueOf(element));
    }

    static int getSize(List<Integer> list){
        return list.size();
    }
}
