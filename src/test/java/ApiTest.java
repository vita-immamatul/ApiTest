import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;

class APITest {

    private final String BASE_URL = "https://www.instagram.com/";

    @Test
    public void testInstagramAPI() {
        RestAssured.baseURI = BASE_URL;
        Response response = given()
                .when()
                .get()
                .then()
                .extract()
                .response();

        assertEquals(response.getStatusCode(), 200);
    }
}
