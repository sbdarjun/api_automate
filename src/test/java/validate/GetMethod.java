package validate;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetMethod {
    @Test
    public void testGetAPI() {
        baseURI = "https://reqres.in/api";
        given().get("/users?page=2").
                then().
                statusCode(200).
                body("data[1].id", equalTo(8))
                .body("data.email", hasItem("lindsay.ferguson@reqres.in"))
                .log().all();
    }
}
