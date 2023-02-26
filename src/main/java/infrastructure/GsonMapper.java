package infrastructure;

import application.Error;
import application.Mapper;
import com.google.gson.Gson;
import domain.CandidateUser;
import domain.User;

public class GsonMapper implements Mapper {

    private final Gson gson;

    public GsonMapper() {
        this.gson = new Gson();
    }

    @Override
    public CandidateUser toCandidateUser(String payload) {
        return gson.fromJson(payload, CandidateUser.class);
    }

    @Override
    public String fromError(Error error) {
        return gson.toJson(error);
    }

    @Override
    public String fromUser(User user) {
        return gson.toJson(user);
    }
}
