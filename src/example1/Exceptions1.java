package example1;

public class Exceptions1 {
    public static void main(String[] args) {
        String[] array = new String[]{"150", "20", "nan", "13", "200"};
        int sum = 0;
        for (int i = 0; i < array.length + 1; i++) {
            try {
                sum += Integer.parseInt(array[i]);
                // kod
            } catch (NumberFormatException nfe) {
                //nfe.printStackTrace();
//                System.out.println(nfe.getMessage());
                System.out.println("Ignoring " + array[i]);
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                System.out.println(aioobe.getMessage());
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
