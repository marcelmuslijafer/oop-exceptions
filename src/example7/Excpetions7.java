package example7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Excpetions7 {
    public static void main(String[] args) {
        Path path = Paths.get("abc.md");

        try (Scanner sc = new Scanner(path)) {
            System.out.println(sc.nextLine());
        } catch (IOException ioe) {
            System.out.println("Error while trying to open or read the file");
        }
    }
}
