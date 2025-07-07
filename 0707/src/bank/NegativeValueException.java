package bank;

    public class NegativeValueException extends Exception {
    public NegativeValueException() {
        super("음수 값은 허용되지 않습니다.");
    }

    public NegativeValueException(String message) {
        super(message);
    }
}
