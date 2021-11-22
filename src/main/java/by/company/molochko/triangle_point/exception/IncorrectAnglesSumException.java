package by.company.molochko.triangle_point.exception;

public class IncorrectAnglesSumException extends Exception {
    private  int actual;

    public int getActual() {
        return actual;
    }

    public IncorrectAnglesSumException(String message, int actual) {
        super(message);
        this.actual = actual;
    }

    public IncorrectAnglesSumException() {
    }

    public IncorrectAnglesSumException(String message) {
        super(message);
    }

    public IncorrectAnglesSumException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectAnglesSumException(Throwable cause) {
        super(cause);
    }
}
