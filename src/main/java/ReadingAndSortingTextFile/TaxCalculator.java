package ReadingAndSortingTextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class TaxCalculator {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>(Files.readAllLines(Paths.get("src/main/java/ReadingAndSortingTextFile/textfile.txt")));
        System.out.println("Before sorting: " + list);
        Collections.sort(list);
        System.out.println("After sorting: " + list);
    }
}
































//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//import static java.nio.file.Files.readAllLines;
//
//public class Question2 {
//    public static void main(String[] args) throws IOException {
//        ArrayList<String> contents = new ArrayList<>(readAllLines(Paths.get("question2.txt")));
//
//        System.out.println("Contents of question2.txt:");
//
//        for (String line : contents) {
//            System.out.println(line);
//        }
//
//        Collections.sort(contents, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return extractInt(o1) - extractInt(o2);
//            }
//
//            int extractInt(String s) {
//                String num = s.replaceAll("\\D", "");
//                return num.isEmpty() ? 0 : Integer.parseInt(num);
//            }
//        });
//        System.out.println("\nSorted contents of question2.txt:");
//        for (String line : contents) {
//            System.out.println(line);
//        }
//    }
//}
//
//
//
