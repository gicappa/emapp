package domain;

import java.util.List;

public record User(String uuid, String email, List<Role> roles) {

}
