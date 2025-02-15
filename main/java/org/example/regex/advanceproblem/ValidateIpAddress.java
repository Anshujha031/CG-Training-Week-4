package org.example.regex.advanceproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIpAddress {

    public static String valid(String s){
        String regex ="^((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while(m.find()){
            return "Valid";
        }


        return "invalid";
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ip address : ");

        String s = sc.nextLine();
        System.out.println(valid(s));
    }
}
