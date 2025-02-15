package org.example.regex.replaceandmodify;

import java.io.FilterOutputStream;

public class CensorBadWord {
    public static void main(String[] args) {


        String s = "This is a damn bad example with some stupid words.";
        String FormatedString = s.replaceAll("\\b(damn|stupid)\\b", "****");
        System.out.println("Original text : " + s);
        System.out.println("Formatted text : " + FormatedString);

    }
}
