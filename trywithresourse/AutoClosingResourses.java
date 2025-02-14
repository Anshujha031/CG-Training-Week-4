package org.example.trywithresourse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResourses {
    public static void main(String[] args) {
        String filePath = "src/main/java/org/example/trywithresourse/";
        try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line=bf.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Error reading file : " + e.getMessage());
        }
    }
}
