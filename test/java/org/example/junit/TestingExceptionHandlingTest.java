package org.example.junit;
import static java.lang.System.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingExceptionHandlingTest {

    TestingExceptionHandling teh = new TestingExceptionHandling();
    @Test
    void divide() {
        try{
            assertEquals(0, teh.divide(2,0));
        }catch (Exception e){
            out.println(e.getMessage());
        }
    }
}