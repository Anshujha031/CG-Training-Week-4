package org.example.junit;

public class DatabaseConnection {
    public boolean connected;

    public void connect(){
        connected = true;
        System.out.println("Database connected");
    }

    public void disconnect(){
        connected = false;
        System.out.println("Database disconnected");
    }

    public boolean isConnected(){
        return connected;
    }
}
