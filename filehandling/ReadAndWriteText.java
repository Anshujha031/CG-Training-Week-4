package org.example.filehandling;
import java.io.*;
public class ReadAndWriteText {

public static void file(String filePath){

    String sourse = "F:\\CG-Training\\Week04-(Collections and generics)\\Day03-JavaStream\\src\\main\\java\\org\\example\\filehandling\\write";
    try(FileInputStream fis = new FileInputStream(filePath);
        FileOutputStream fio = new FileOutputStream(sourse)){

        int byteData;
        while((byteData = fis.read()) != -1){
            fio.write(byteData);
        }
    } catch (Exception e) {
        System.out.println("Error " + e.getMessage());
    }
}
    public static void main(String[] args) {
        String filePath = "F:\\CG-Training\\Week04-(Collections and generics)\\Day03-JavaStream\\src\\main\\java\\org\\example\\filehandling\\text";

        ReadAndWriteText.file(filePath);
}
}
