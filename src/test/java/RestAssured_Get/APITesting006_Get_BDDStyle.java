package RestAssured_Get;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting006_Get_BDDStyle {
    @Test
    public void test_get_positive() {
        String pincode = "90210";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/us/"+pincode)
                .when()
                .get()
                .then().log().all().statusCode(200);
    }
    @Test
    public void test_get_negative() {
        String Pin_code = "-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/us/" + Pin_code)
                .when().get()
                .then().log().all().statusCode(404);
    }
}
