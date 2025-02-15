package org.example.junit;

public class TestingExceptionHandling {
    static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide bt zero");
        }
        return a / b;
    }
}
