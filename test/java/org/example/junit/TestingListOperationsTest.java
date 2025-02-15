package org.example.junit;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestingListOperationsTest {
    List<Integer> list = new ArrayList<>();

    TestingListOperations tlo = new TestingListOperations();

    @Test
    void removeElement() {
        TestingListOperations.addElement(list, 2);
        assertTrue(tlo.removeElement(list,2));
    }

    @Test
    void getSize() {
        assertEquals(0,tlo.getSize(list));
    }
}