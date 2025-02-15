package org.example.regex.basicproblems;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateALicensePlateNumber {

    public static String validLisense(String s){
        String regex = "[A-Z]{2}[\\d]{4}";
        Pattern p = Pattern.compile(regex);
        Matcher m  = p.matcher(s);

        while(m.find()){
            return "Valid";
        }
        return "Invalid";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the License Number");
        String s = sc.nextLine();
        System.out.println(validLisense(s));
    }
}
