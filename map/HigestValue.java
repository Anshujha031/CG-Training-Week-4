package org.example.map;

import java.util.HashMap;
import java.util.*;

public class HigestValue {
    public static void main(String[] args) {
        Map<String,Integer> m = new HashMap<>();
        m.put("A",10);
        m.put("B",20);
        m.put("C",4);
        int max = 0;
        String key = "";
        for(String i : m.keySet()){

            if(m.get(i)>max){
                max = m.get(i);
                key = i;

            }
        }
        System.out.println(key);
    }
}
