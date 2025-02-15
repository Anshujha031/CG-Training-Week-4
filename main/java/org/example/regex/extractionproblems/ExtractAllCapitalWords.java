package org.example.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalWords {
    public static void main(String[] args) {
        String s = "The EiffelTower is in Paris and the Statue of Liberty is in New York.";
        String regex = "[A-Z]\\w+";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
