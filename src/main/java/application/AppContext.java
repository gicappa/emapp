package application;

import domain.ManageUsersUseCase;
import domain.EmailService;
import domain.UsersRepo;
import infrastructure.AngusEmailService;
import infrastructure.GsonMapper;
import infrastructure.DbUserRepo;

public class AppContext {

    public ManageUsersUseCase makeManageUsersUseCase() {
        return new ManageUsersUseCase(makeUsersRepo(), makeEmailService());
    }

    public EmailService makeEmailService() {
        return new AngusEmailService();
    }

    public UsersRepo makeUsersRepo () {
        return new DbUserRepo();
    }

    public Mapper makeMapper() {
        return new GsonMapper();
    }
}
