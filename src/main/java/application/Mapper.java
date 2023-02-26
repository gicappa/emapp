package application;

import domain.CandidateUser;
import domain.User;

public interface Mapper {

    CandidateUser toCandidateUser(String payload);

    String fromError(Error error);

    String fromUser(User user);
}
