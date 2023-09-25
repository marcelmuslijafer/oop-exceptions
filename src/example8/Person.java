package example8;

public class Person {
    private String oib;
    private String name;

    public Person(String oib, String name) throws CheckedPersonException {
        if (oib == null || name == null) {
            throw new PersonException("Person cannot have fields that are null");
        }
        if (oib.length() != 10) {
            throw new PersonException("Person's oib must be of size 10");
        }

        if (name.isEmpty()) {
            throw new CheckedPersonException("Name must not be empty");
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
}
