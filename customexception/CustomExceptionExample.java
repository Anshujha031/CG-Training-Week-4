package org.example.customexception;

import java.util.Scanner;

public class CustomExceptionExample {

    public static void validAge(int age) throws UserDefinedException{
        if(age < 18){
            throw new UserDefinedException("Age must be 18 or above");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try{
         int age = sc.nextInt();
         CustomExceptionExample.validAge(age);

        }catch(UserDefinedException e){
            System.out.println("Invalid age  : " + e.getMessage());
        }
    }
}
