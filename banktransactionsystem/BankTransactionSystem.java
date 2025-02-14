package org.example.banktransactionsystem;

public class BankTransactionSystem {

    public static void withdraw(int Withamt) throws InsufficientBalanceException{
        int amt = 1000;
        if(Withamt > amt){
            throw new InsufficientBalanceException("Insufficient balance! ");
        }
        if(amt<0){
            throw new IllegalArgumentException("Invalid amount!");
        }
        System.out.println("Withdrawl successful, new balance : " + (amt-Withamt) );

    }

    public static void main(String[] args) {
        try{
            int withamt = 10;
            BankTransactionSystem.withdraw(withamt);
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
