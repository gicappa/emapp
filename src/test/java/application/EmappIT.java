package application;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

public class EmappIT {

    @Test
    void it_creates_a_user() {
        given()
            .port(4567)
            .body("""
                {
                    email: "giancarlo.pace@gmail.com",
                    roles: [{ id: 1 }]
                }
                """)
            .contentType("application/json")
            .when()
            .post("/users")
            .then().statusCode(201);
    }
}