package lv.rvt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utils {
    public static BufferedReader getFileReader(String filename) {
        
        try {
            InputStream inputStream = App.class.getResourceAsStream(File.separator + filename);
            if (inputStream == null) {
                throw new FileNotFoundException();
            }
            return new BufferedReader(new InputStreamReader(inputStream));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
