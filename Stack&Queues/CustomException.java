public class CustomException extends Exception {
    public CustomException(String message) {
        // super call parents class, here parent class is exception
        super(message);
    }
}
