import io.restassured.response.Response;
import org.testng.annotations.Test;


import java.util.logging.Logger;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.when;

import static org.testng.Assert.assertTrue;

public class restAssured {


    @Test(testName = "restAssured Test")
    public static void restAssuredTest(){
        when().
              get("https://rest-assured.io/").
        then().statusCode(200);
        Response response =  get("https://rest-assured.io/");
        assertTrue(response.body().asString().contains("Testing and validating REST services in Java"));
    }

}
