package org.example.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {
    public static void main(String[] args) {
        String s = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        String regix = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
        Pattern p = Pattern.compile(regix);
        Matcher m = p.matcher(s);

        while (m.find()){
            System.out.println("Date Fount : " + m.group());
        }

    }
}
