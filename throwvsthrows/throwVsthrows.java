package org.example.throwvsthrows;

public class throwVsthrows {
    public static void calculateInterest(double amt , double rate , int year) throws IllegalArgumentException{
        if(rate<0 || amt<0){
            throw new  IllegalArgumentException("Amount and Rate should not be negative");
        }
        System.out.println("The Interest are : " + (amt * rate * year) / 100);
    }

    public static void main(String[] args) {
        try {
            double amt = -12;
            double rate = 10;
            int year = 2;
            calculateInterest(amt, rate, year);
        }catch(IllegalArgumentException e){
            System.out.println("Invalid input : " + e.getMessage());
        }
    }
}
