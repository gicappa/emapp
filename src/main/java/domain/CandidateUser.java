package domain;

import java.util.List;

public record CandidateUser(String email, List<Role> roles) {

}
