package example2;

import java.io.IOException;

public class Exceptions2 {
    public static void main(String[] args) {
        String[] array = new String[]{"150", "20", "nan", "13", "200"};
        int sum = 0;
        for (int i = 0; i < array.length + 1; i++) {
            try {
                sum += Integer.parseInt(array[i]);
                // kod
                // jos koda
            } catch(NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                System.out.println(ex.getMessage());
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
