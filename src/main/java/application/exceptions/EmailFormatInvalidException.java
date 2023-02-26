package application.exceptions;

public class EmailFormatInvalidException extends EmappException {

    public EmailFormatInvalidException(String field, String value) {
        super("""
            The field '%s' contains the value '%s' and is not valid email.
            """.formatted(field, value));
    }

    @Override
    public String getErrorCode() {
        return "ERR-002";
    }
}
