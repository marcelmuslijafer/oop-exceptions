package example8;

public class Exceptions8 {
    public static void main(String[] args) throws CheckedPersonException {
        try {
            Person person = new Person("123456789", "Marcel");
        } catch (PersonException pe) {
            throw new RuntimeException(pe.getMessage(), pe);
        }
//        Person person1 = new Person(null, null);

//        System.out.println(person.getName());
//        System.out.println(person1.getName());
    }
}
