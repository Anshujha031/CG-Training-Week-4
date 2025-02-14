package org.example.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {

    public static void reverseQueue(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
          s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }


    }
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        Reverse.reverseQueue(q);
        System.out.println(q);

    }
}
