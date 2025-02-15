package org.example.regex.advanceproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCurrencyValues {

    public static void list(String s){
        String regex = "\\$?\\d{2}\\.\\d{2}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.print(m.group() + ",");
        }
    }


    public static void main(String[] args) {
        String s = "The price is $45.99, and the discount is 10.50.";
        list(s);

    }
}
