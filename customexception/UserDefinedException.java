package org.example.customexception;

public class UserDefinedException extends Exception{
    public UserDefinedException(String message){
        super(message);
    }
}
