package org.example.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNUmber {

    public static String valid(String s){
        String regex = "^#[0-9A-Fa-f]{6}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            return "Valid";
        }
        return "Invalid";
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String s = sc.nextLine();
        System.out.println(valid(s));

    }
}
