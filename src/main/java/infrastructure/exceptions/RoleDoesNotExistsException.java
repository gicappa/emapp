package infrastructure.exceptions;

import application.exceptions.EmappException;
import domain.Role;

public class RoleDoesNotExistsException extends EmappException {

    public RoleDoesNotExistsException(Role role) {
        super("""
            The role with id '%s' does not exists in the database.
            """.formatted(role.id()));
    }

    @Override
    public String getErrorCode() {
        return "ERR-003";
    }
}
