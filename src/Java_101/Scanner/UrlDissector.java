package Java_101.Scanner;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *  Demonstrates the use of Scanner to read file input and parse it using
 *  alternative delimiters.
 */
public class UrlDissector {

    public static void main(String[] args) throws IOException {
        final Scanner fileSc = new Scanner(new File("src/Java_101/Scanner/url.txt"));

        while (fileSc.hasNext()) {
            String url = fileSc.nextLine();
            System.out.println("URL: " + url);

            Scanner urlSc = new Scanner(url);
            urlSc.useDelimiter("/");

            while (urlSc.hasNext()) {
                System.out.println("  " + urlSc.next());
            }
            System.out.println();
        }

        fileSc.close();

        // Another approach to reads and process each line of a file
        Path altFileSc = Paths.get("src/Java_101/Scanner/url.txt");
        String contents = Files.readString(altFileSc);
        System.out.println(contents);




    }

}
