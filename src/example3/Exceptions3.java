package example3;

public class Exceptions3 {
    public static void main(String[] args) {
        String[] array = new String[]{"150", "20", "nan", "13", "200", null};
        int sum = 0;
        for (int i = 0; i < array.length + 1; i++) {
            try {
                System.out.println(array[i].length());
                sum += Integer.parseInt(array[i]);
                // kod
            } catch(NumberFormatException nfe) {
                System.out.println("Ignoring because it is not a number: " + array[i]);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println("Cannot access element at index: " + i);
            } catch (RuntimeException re) {
//                re.printStackTrace();
                System.out.println(re.getMessage());
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
