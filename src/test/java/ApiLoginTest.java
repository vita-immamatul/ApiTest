import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiLoginTest {

    @Test
    public void testPostRequest() {
        RestAssured.baseURI = "https://reqres.in/api";
        String requestBody = "{ \"email\": \"eve.holt@reqres.in\", \"password\": \"pistol\" }";
        given().header("Content-Type", "application/json")
                .body(requestBody)
                .post("/login")
                .then()
                .statusCode(200)
                .body("token", notNullValue());
    }
}

