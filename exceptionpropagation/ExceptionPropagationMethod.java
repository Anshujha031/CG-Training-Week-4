package org.example.exceptionpropagation;

public class ExceptionPropagationMethod {
    public static void method1(int a , int b) throws ArithmeticException{
        int res = a/b;
        System.out.println(res);
    }

    public static void method2(int a,int b){
        method1(a,b);
    }

    public static void main(String[] args) {
        try {
            int a = 12;
            int b = 0;
            method2(a,b);
        } catch (Exception e) {
            System.out.println("Handled exception in  main " + e.getMessage());
        }
    }
}
