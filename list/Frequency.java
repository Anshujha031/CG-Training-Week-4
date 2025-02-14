package org.example.list;

import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple","Banana","Apple","Orange");
        Map<String,Integer> f = new HashMap<>();
        for(String i : list){
            f.put(i,f.getOrDefault(i,0)+1);
        }
        System.out.println(f);

    }
}
