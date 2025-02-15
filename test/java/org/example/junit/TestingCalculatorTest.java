package org.example.junit;
import static java.lang.System.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingCalculatorTest {

    TestingCalculator tc = new TestingCalculator();
    @Test
    void add() {
        assertEquals(10,tc.add(5,5));
    }

    @Test
    void subtract() {
        assertEquals(5,tc.subtract(10,5));
    }

    @Test
    void multiply() {
        assertEquals(10,tc.multiply(10,1));
    }

    @Test
    void divide() {

//        assertEquals(1,tc.divide(10,10));
        try{
            tc.divide(5,0);
            fail("Cant divide by zero");
        }catch (ArithmeticException e){
              out.println(e.getMessage());
        }
    }
}