package lv.rvt;

import java.io.FileNotFoundException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Utils {
    public static Path getFilePath(String filename) {
        try {
            URL resourceUrl = App.class.getClassLoader().getResource(filename);
            if (resourceUrl == null) {
                throw new FileNotFoundException("File not found: " + filename);
            }
            return Paths.get(resourceUrl.toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
