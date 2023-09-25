package example6;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exceptions6 {
    public static void main(String[] args) { //throws IOException
        Path path = Paths.get("abc.md");

        Scanner sc = null;
        try {
            sc = new Scanner(path);
            System.out.println(sc.nextLine());
        } catch (IOException ioe) {
            System.out.println("Error while trying to open or read the file");
        }
        sc.close();
//

//        Scanner sc = new Scanner(path);
//        System.out.println(sc.nextLine());
    }
}
