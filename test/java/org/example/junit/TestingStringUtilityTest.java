package org.example.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingStringUtilityTest {

    TestingStringUtility tsu = new TestingStringUtility();
    @Test
    void reverse() {
        assertEquals("aaa", tsu.reverse("aaa"));
    }

    @Test
    void isPlindrome() {
        assertTrue(tsu.isPlindrome("ababa"));
    }

    @Test
    void toUppercase() {
        assertEquals("ABC" , tsu.toUppercase("ABC"));
    }
}