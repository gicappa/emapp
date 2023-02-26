package application.exceptions;

public abstract class EmappException extends RuntimeException {
    public abstract String getErrorCode();

    public EmappException(String message) {
        super(message);
    }
}
