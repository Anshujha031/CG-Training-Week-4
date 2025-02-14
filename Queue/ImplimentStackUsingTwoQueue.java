package org.example.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

public class ImplimentStackUsingTwoQueue {

    public Queue<Integer> q1;
    public Queue<Integer> q2;
    public ImplimentStackUsingTwoQueue(){
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    public void push(int x){
        q1.add(x);
    }

    public int pop(){

        while(q1.size() > 1){
            q2.add(q1.poll());
        }
        int topElement = q1.poll();

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return topElement;
    }
    public static void main(String[] args) {

        ImplimentStackUsingTwoQueue s = new ImplimentStackUsingTwoQueue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
    }
}
