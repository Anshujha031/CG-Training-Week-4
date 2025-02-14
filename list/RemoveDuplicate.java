package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

    public static void main(String[] args) {
        List<Integer> duplicate = new ArrayList<>(Arrays.asList(10,10,23,13,13,20));
        List<Integer> NonDuplicate = new ArrayList<>();
        for(int i : duplicate){
            if(!NonDuplicate.contains(i)){
                NonDuplicate.add(i);
            }
        }
        System.out.println(NonDuplicate);
    }
}
