package org.example.regex.advanceproblem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validateacreditcard {

        public static String validCreditCard(String s){
            String regex ="^4\\d{15}$";

            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(s);

            while(m.find()){
                return "Valid";
            }


            return "invalid";
        }

    public static String validMasterCard(String s){
        String regex ="^5\\d{15}$";

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
            System.out.println("Credit Card "+ validCreditCard(s));
            System.out.println("Master Card :" + validMasterCard(s));
        }
    }


