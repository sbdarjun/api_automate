package validate;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class PostAPI {
    @Test
    public void testPostAPI(){
        baseURI = "https://reqres.in/api";
        JSONObject request = new JSONObject();
        request.put("name", "tester");
        request.put("job","Software QA");
        given()
                .header("Content-Type","application/json")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("/users")
                .then()
                .statusCode(201)
                .log().all();
    }
}
