package lv.rvt;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        Path path = Utils.getFilePath("data.csv");
        try {
            List<String> lines = Files.readAllLines(path);
            
            for (String string : lines) {
                System.out.println(string);
            }
        } catch (IOException e) {
            System.out.println("File not found: " + path.toAbsolutePath());
        }
        

    }

}
