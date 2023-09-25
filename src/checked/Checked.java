package checked;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Checked {

    public static void main(String[] args) throws IOException {
        System.out.println("Start");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        System.out.println("Stop");

        Path p = Paths.get("/home/marcel/Documents/abc.txt");
        try (Scanner sc = new Scanner(p)) {
            System.out.println(sc.next());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

//        try (Bar b = new Bar()) {
//            b.serveDBeer();
//        } catch (IOException ioe) {
//            System.out.println("Dogodila se greska");
//        }

        Building building = new Building();

        building.turnDownMusic();

//        Scanner sc = null;
//        try {
//            sc = new Scanner(p);
//            System.out.println(sc.next());
//        } catch (IOException ioe) {
//            System.out.println(ioe.getMessage());
//        } finally {
//            sc.close();
//        }
    }
}
