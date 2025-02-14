package org.example.Queue;
import java.util.*;

public class BinaryNumberQueue {

    public static List<String> generateBinary( int n){
        List<String> res = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("1");

        for(int i=0;i<n;i++){
            String b = q.remove();
            res.add(b);
            q.add(b +"0");
            q.add(b +"1");
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
      List<String> bn =  generateBinary(n);
        System.out.println(bn);


    }
}
