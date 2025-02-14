package org.example.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {

    public static List<Integer> list(List<Integer> l , int position){
        List<Integer> rotatedList = new ArrayList<>();
        position = position% l.size();

        rotatedList.addAll(l.subList(position,l.size()));
        rotatedList.addAll(l.subList(0,position));
        return rotatedList;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10,20,30,40,50));

        System.out.println("list before rotate : > " + arr);
        System.out.println("list after rotate : >  " + RotateList.list(arr,2)) ;




    }
}
