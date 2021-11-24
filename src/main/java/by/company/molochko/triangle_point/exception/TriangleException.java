package by.company.molochko.triangle_point.exception;

public class TriangleException extends Exception {
    public TriangleException() {
    }

    public TriangleException(String message) {
        super(message);
    }

    public TriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public TriangleException(Throwable cause) {
        super(cause);
    }
}

