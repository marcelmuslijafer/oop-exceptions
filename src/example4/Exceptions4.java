package example4;

public class Exceptions4 {
    public static void main(String[] args) {
        Person person = new Person("1234567890", "Marcel");
        System.out.println(person);

        try {
            Person p1 = new Person("23", "Ante");
            System.out.println(p1);
        } catch (IllegalArgumentException iae) {
            System.out.println("Cannot create person: " + iae.getMessage());
        }

        try {
            Person p2 = new Person(null, "Ante");
            System.out.println(p2);
        } catch (IllegalArgumentException iae) {
            try {
                Person p3 = new Person("1234567890", null);
                System.out.println(p3);
            } catch (IllegalArgumentException iae2) {
                System.out.println("Okej, necu stvarat osobe");
            }
        }

        System.out.println("KRAJ");
    }
}
