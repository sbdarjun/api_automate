package validate;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class DeleteAPI {
    @Test
    public void testDeleteAPI(){
        baseURI = "https://reqres.in/api";
        when()
                .delete("/users/2")
                .then()
                .statusCode(204)
                .log().all();
    }
}
