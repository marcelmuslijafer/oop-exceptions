package example5;

public class Exceptions5 {
    public static void main(String[] args) throws InterruptedException {
        Car car = new Car("BMW", "M4", 280);
//        try {
//            car.drive("Split");
//        } catch (InterruptedException ie) {
//            System.out.println("Something interrupted my trip to Split");
//        }
        car.drive("Split");
    }
}
