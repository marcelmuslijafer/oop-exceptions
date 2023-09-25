package example5;

public class Car {
    private String type;
    private String model;
    private int speed;

    public Car(String type, String model, int speed) {
        this.type = type;
        this.model = model;
        this.speed = speed;
    }

    public void drive(String destination) throws InterruptedException {
        System.out.println("Starting the car " + this);
        System.out.println("Driving to destination: " + destination);
        Thread.sleep(3000);
        System.out.println("Arrived!");
    }

//    public void drive(String destination) {
//        System.out.println("Starting the car " + this);
//        System.out.println("Driving to destination: " + destination);
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException ie) {
//            System.out.println("Something interrupted my trip to " + destination);
//            return;
//        }
//        System.out.println("Arrived!");
//    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                '}';
    }
}
