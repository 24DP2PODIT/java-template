package lv.rvt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class App 
{
    public static void main( String[] args )
    {
        BufferedReader reader = Utils.getFileReader("data.csv");

        String line;
        try {
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getStackTrace());
        }


    }

}
