package example0;

public class Exceptions0 {

    public static void main(String[] args) {
        String[] array = new String[]{"150", "20", "nan", "13", "200"};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Integer.parseInt(array[i]);
        }
        System.out.println("The sum is: " + sum);

    }
}
