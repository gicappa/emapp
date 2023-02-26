package application;

import static application.Validator.checkIsEmailValid;
import static application.Validator.checkIsPresent;
import static spark.Spark.post;

import application.exceptions.EmappException;
import domain.CandidateUser;
import domain.ManageUsersUseCase;
import domain.User;

public class Emapp implements Runnable {

    private final Mapper mapper;
    private final ManageUsersUseCase manageUsersUseCase;

    public Emapp(AppContext ctx) {
        this.mapper = ctx.makeMapper();
        this.manageUsersUseCase = ctx.makeManageUsersUseCase();
    }

    public void run() {
        post("/users", (request, response) -> {
            try {
                CandidateUser candidateUser = mapper.toCandidateUser(request.body());
                User user = createUser(candidateUser);
                response.status(201);
                return mapper.fromUser(user);
            } catch (EmappException ee) {
                response.status(400);
                return mapper.fromError(new Error(ee.getErrorCode(), ee.getMessage()));
            }
        });
    }

    private User createUser(CandidateUser candidateUser) {
        checkIsPresent("email", candidateUser.email());
        checkIsEmailValid("email", candidateUser.email());
        return manageUsersUseCase.createUser(candidateUser);
    }
}
