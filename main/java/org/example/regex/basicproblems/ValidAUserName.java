package org.example.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidAUserName {
public static String valid(String input){
    String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,15}";
    Pattern pattern = Pattern.compile(regex);

    Matcher m = pattern.matcher(input);

    while(m.find()){
         return "Valid";
    }
    return "Invalid";
}


    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the User Name : ");
        String input = sc.nextLine();
        System.out.println(valid(input));


    }
}
