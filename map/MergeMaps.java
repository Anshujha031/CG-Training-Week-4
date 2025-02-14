package org.example.map;

import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    public static void main(String[] args) {
        Map<String,Integer> m1 = new HashMap<>();
        m1.put("A",1);
        m1.put("B",2);
        Map<String ,Integer> m2 = new HashMap<>();
        m2.put("B" , 3);
        m2.put("C",4);

        Map<String,Integer> mergemap = new HashMap<>(m1);
        m2.forEach((key,value) ->
                mergemap.merge(key,value,Integer::sum));
        System.out.println(mergemap);
    }

}
