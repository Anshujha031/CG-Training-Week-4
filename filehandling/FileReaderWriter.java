package streams.filehandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {
    public static void copyFile(String source, String destination) throws IOException {
        try (FileReader fr = new FileReader(source);
             FileWriter fw = new FileWriter(destination)) {

            int charData;
            while ((charData = fr.read()) != -1) {
                fw.write(charData);
            }
            System.out.println("File copied successfully.");
        }
    }

    public static void main(String[] args) {
        String source = "src/main/java/streams/filehandling/source.txt";
        String destination = "src/main/java/streams/filehandling/destination.txt";
        try {
            copyFile(source, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

