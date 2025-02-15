package org.example.regex.advanceproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSSN {

    public static String valid(String s){
        String regex = "\\d{3}-\\d{2}-\\d{4}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()) {
            return "valid";
        }
        return "invalid";
    }
    public static void main(String[] args) {
        String s = "My SSN is 123456789.";
        System.out.println(valid(s));



    }
}
