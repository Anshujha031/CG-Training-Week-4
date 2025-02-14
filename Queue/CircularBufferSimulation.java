package org.example.Queue;

import java.util.Queue;
import java.util.*;

public class CircularBufferSimulation {

    public Queue<Integer> buffer;
    public int capacity;

    public CircularBufferSimulation(int capacity){
        this.buffer = new LinkedList<>();
        this.capacity = capacity;
    }

    public void insert(int val){
        if(buffer.size()==capacity){
            buffer.poll();
        }
        buffer.offer(val);
    }

    public void display(){
        System.out.println("Buffer : > " + buffer);
    }
    public static void main(String[] args) {
        CircularBufferSimulation c = new CircularBufferSimulation(3);
        c.insert(1);
        c.insert(4);
        c.insert(3);
        c.display();
        c.insert(5);
        c.display();

    }
}
