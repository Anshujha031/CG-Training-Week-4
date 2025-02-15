package org.example.regex.extractionproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllEmailAddressesFromaText {

    public static void ExtractEmail(String s){
        String regex = "[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[A-Za-z]{2,}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println("Email : " + m.group());
        }

    }


    public static void main(String[] args) {


       String s = "Contact us at support@example.com and info@company.org";

        ExtractEmail(s);

    }
}
