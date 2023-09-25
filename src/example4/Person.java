package example4;

public class Person {
    private String oib;
    private String name;

    public Person(String oib, String name) throws IllegalArgumentException {
        if (oib == null || name == null) {
            IllegalArgumentException iae = new IllegalArgumentException("Oib and name cannot be null");
            throw iae;
        }

        if (oib.length() != 10) {
            throw new IllegalArgumentException("Oib must be of size 10");
        }
        this.oib = oib;
        this.name = name;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "oib='" + oib + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
