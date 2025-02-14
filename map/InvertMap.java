package org.example.map;

import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class InvertMap {

    public static void main(String[] args) {
        Map<String , Integer> m = new HashMap<>();
        m.put("A" , 10);
        m.put("B",20);
        m.put("C" , 10);

        Map<Integer,List<String>> invertedMap = new HashMap<>();
        for(String key : m.keySet()){
            int val = m.get(key);
            if(!invertedMap.containsKey(val)){
                invertedMap.put(val,new ArrayList<>());
            }
            invertedMap.get(val).add(key);

        }
        System.out.println(invertedMap);
    }
}
