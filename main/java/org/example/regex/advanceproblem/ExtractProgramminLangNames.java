package org.example.regex.advanceproblem;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgramminLangNames {

    public static void list(String s){
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while(m.find()){
            System.out.print(m.group() + ",");
        }
    }

    public static void main(String[] args) {
        String s = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        list(s);
    }
}
