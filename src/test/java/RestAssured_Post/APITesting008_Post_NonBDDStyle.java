package RestAssured_Post;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting008_Post_NonBDDStyle {

    @Description("Verify token should generate")
    @Test
    public void test_tc1(){
        //https://restful-booker.herokuapp.com/auth
        // Body { "username" : "admin",
        //    "password" : "password123"}
        // Content-Type

        String payload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";
        RequestSpecification r= RestAssured.given();
                r.baseUri("https://restful-booker.herokuapp.com");
                r.basePath("/auth");
                r.contentType(ContentType.JSON).log().all();
                r.body(payload);

        Response response1 = r.when().log().all().post();
        ValidatableResponse VR = response1.then().log().all().statusCode(200);

    }
}
