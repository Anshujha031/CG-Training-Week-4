package org.example.regex.replaceandmodify;
import java.util.regex.*;

public class ReplaceMultipleSpaceWithSingleSpace {
    public static void main(String[] args) {
        String input = "This is an    example with      multiple spaces.";

        String replacesText = input.replaceAll("\\s+" , " ");
        System.out.println("Original Text : " + input);
        System.out.println("Formatted text : " + replacesText);
    }
}
