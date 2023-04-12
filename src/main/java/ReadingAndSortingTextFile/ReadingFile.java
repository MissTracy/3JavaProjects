package ReadingAndSortingTextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class ReadingFile {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get("src/main/java/ReadingAndSortingTextFile/textfile.txt")));
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}

