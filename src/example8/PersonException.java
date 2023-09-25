package example8;

public class PersonException extends RuntimeException {

    public PersonException() {
    }

    public PersonException(String message) {
        super(message);
    }

//    public PersonException(String message, Throwable cause) {
//        super(message, cause);
//    }

}
