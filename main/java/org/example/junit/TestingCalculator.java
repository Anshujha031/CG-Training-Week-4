package org.example.junit;

public class TestingCalculator {
    static int add(int a , int b){
        return a+b;
    }
    static int subtract(int a , int b){
        return a-b;
    }
    static int multiply(int a , int b){
        return a*b;
    }
    static int divide(int a , int b){
        if(b==0){
            throw new ArithmeticException("Cannot divide bt zero");
        }
        return a/b;
    }



}
