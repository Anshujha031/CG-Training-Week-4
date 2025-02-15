package org.example.regex.advanceproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.LinkedHashSet;

public class FindRepeatingWord {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";
        String regex = "\\b(\\w+)\\b\\s+\\b\\1\\b";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(text);

        Set<String> repeatedWords = new LinkedHashSet<>();
        while (m.find()) {
            // matcher.group(1) returns the repeated word.
            repeatedWords.add(m.group(1));
        }

        // Print the results as comma-separated words
        System.out.println("Repeating words: " + String.join(", ", repeatedWords));
    }

}
