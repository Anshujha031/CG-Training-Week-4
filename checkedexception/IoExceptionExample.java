package org.example.checkedexception;

import java.io.*;

public class IoExceptionExample {

    public static void main(String[] args){

        File file = new File("F:\\CG-Training\\Week04-(Collections and generics)\\Day04-Exception\\src\\main\\java\\org\\example\\checkedexception\\data.txt");

        try(
        BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println("File Not Found");
        }
    }


    }

