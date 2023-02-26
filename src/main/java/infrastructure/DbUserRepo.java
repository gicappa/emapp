package infrastructure;

import domain.CandidateUser;
import domain.Role;
import domain.User;
import domain.UsersRepo;
import infrastructure.exceptions.RoleDoesNotExistsException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DbUserRepo implements UsersRepo {

    private final Logger logger = LoggerFactory.getLogger("repo|users");

    @Override
    public User createUser(CandidateUser user) {
        user.roles().forEach(this::checkRoleExists);
        String uuid = insertUserInDb(user);

        return new User(uuid, user.email(), user.roles());
    }

    private void checkRoleExists(Role role) {
        if (!selectRoleIdInDb(role)) {
            throw new RoleDoesNotExistsException(role);
        }
    }

    private String insertUserInDb(CandidateUser user) {
        logger.info("insert the user({}) in the database and return the user id", user.email());
        return "00000000-0000-0000-0000-000000000000";
    }

    private boolean selectRoleIdInDb(Role role) {
        logger.info("select the role with id({}) in the role lists and return true if it present", role.id());
        return true;
    }
}
