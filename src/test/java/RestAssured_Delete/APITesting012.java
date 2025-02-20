package RestAssured_Delete;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting012 {
    @Description("Verify Patch req")
    @Test
    public void test_patchmethod(){
        // Baseuri- https://restful-booker.herokuapp.com
        // BasePath - /booking
        // body- {"firstname" : "John",
        //    "lastname" : "Snow"}
        // Cookies = token

        String token = "024351a9c588595";
        String bookingid = "1578";
        RequestSpecification RS = RestAssured.given();
        RS.baseUri("https://restful-booker.herokuapp.com");
        RS.basePath("/booking/" +bookingid);
        RS.contentType(ContentType.JSON);
        RS.cookie("token", token);
        RS.log().all();

        Response response = RS.when().delete();
        ValidatableResponse VR = response.then().log().all();
        VR.statusCode(201);

    }
}
