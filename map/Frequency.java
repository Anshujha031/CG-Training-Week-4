package org.example.map;

import java.util.Arrays;
import java.util.*;

public class Frequency {
    public static void main(String[] args) {

        String s =  "Hello world, hello Java!";
        String[] arr = s.toLowerCase().replaceAll("^a-zA-Z","").split("\\s+");
        Map<String,Integer> f = new HashMap<>();

        for(String i : arr){
            f.put(i, f.getOrDefault(i,0)+1);
        }
        System.out.println(f);


    }
}
