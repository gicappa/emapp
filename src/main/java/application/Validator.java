package application;

import application.exceptions.EmailFormatInvalidException;
import application.exceptions.MissingMandatoryFieldException;
import java.util.regex.Pattern;

public class Validator {

    public static void checkIsPresent(String field, String value) {
        if (isPresent(value))
            return;

        throw new MissingMandatoryFieldException(field);
    }

    public static void checkIsEmailValid(String field, String value) {
        if (isEmailValid(value))
            return;

        throw new EmailFormatInvalidException(field, value);
    }

    public static boolean isPresent(String param) {
        return param != null && !param.isBlank();
    }

    public static boolean isEmailValid(String email) {
        return Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
            .matcher(email)
            .matches();
    }
}
