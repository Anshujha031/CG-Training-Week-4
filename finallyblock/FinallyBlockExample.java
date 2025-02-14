package org.example.finallyblock;

import java.util.Scanner;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int res = a/b;
            System.out.println("Result : " + res);
        }catch (ArithmeticException e){
            System.out.println("error " + e.getMessage());
        }finally {
            System.out.println("Operation completed");
        }

    }
}
