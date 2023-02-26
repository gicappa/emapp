package application.exceptions;

public class MissingMandatoryFieldException extends EmappException {

    public MissingMandatoryFieldException(String field) {
        super("The field '%s' is not present in the request.".formatted(field));
    }

    @Override
    public String getErrorCode() {
        return "ERR-001";
    }
}
