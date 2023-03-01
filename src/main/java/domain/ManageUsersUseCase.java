package domain;

public class ManageUsersUseCase {

    private final UsersRepo usersRepo;
    private final EmailService emailService;

    public ManageUsersUseCase(UsersRepo usersRepo, EmailService emailService) {
        this.usersRepo = usersRepo;
        this.emailService = emailService;
    }

    public User createUser(CandidateUser candidateUser) {
        var user = usersRepo.createUser(candidateUser);
        emailService.sendVerificationEmailTo(user);
        return user;
    }
}
