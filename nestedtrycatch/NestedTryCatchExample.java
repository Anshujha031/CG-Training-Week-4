package org.example.nestedtrycatch;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int[] arr = new int[5];
            System.out.println("Enter the Array : ");
            for(int i=0;i<5;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Tell me the index ");
            int index = sc.nextInt();


            System.out.println("Tell me the divisor");
            int divisor = sc.nextInt();

            int res = arr[index]/divisor;
            System.out.println(res);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
