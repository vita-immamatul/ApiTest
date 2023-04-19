import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApiLoginTest {

    private final String BASE_URL = "https://www.instagram.com/";

    @Test
    public void testInstagramLoginAPI() {
        RestAssured.baseURI = BASE_URL;
        Response response = given()
                .when()
                .get("/login")
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
    }
}