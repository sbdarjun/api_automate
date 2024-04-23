package validate;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetMethod {
    @Test
    public void get() {
        Response res = RestAssured.get("https://reqres.in/api/users?page=2");
        System.out.println(res.getStatusCode());
        System.out.println(res.getTime());
        System.out.println(res.getBody().asString());
        System.out.println(res.getStatusLine());
        System.out.println(res.getHeader("content-type"));
        int statusCode = res.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }
}
