package util;

import java.io.*;
import java.nio.file.Path;
import java.util.Objects;

public class PropertyReader {
    public String getProperty(String property) {
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        Objects.requireNonNull(getClass()
                                .getClassLoader()
                                .getResourceAsStream(".property"))))) {
            while (br.ready()) {
                String[] arr = br.readLine().split(" = ");
                if (arr[0].equals(property)) {
                    return arr[1];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "No such property in file";
    }
}
