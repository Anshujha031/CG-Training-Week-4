package org.example.uncheckedexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunTimeExceptionExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


       try{
           int a = sc.nextInt();
           int b = sc.nextInt();
           int res = a/b;
           System.out.println("Result : " + res);
       }catch (ArithmeticException e){
           System.out.println("Change the value of b " );
       }catch (InputMismatchException e){
           System.out.println("Give the values only in Integer " );
       }

    }
}
