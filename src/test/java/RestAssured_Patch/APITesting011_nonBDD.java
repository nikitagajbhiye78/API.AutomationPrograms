package RestAssured_Patch;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class APITesting011_nonBDD {
    @Description("Verify Patch req")
    @Test
    public void test_patchmethod(){
    // Baseuri- https://restful-booker.herokuapp.com
        // BasePath - /booking
        // body- {
        //    "firstname" : "John",
        //    "lastname" : "Snow"}
        // Cookies = token

        String token = "024351a9c588595";
        String bookingid = "1578";
        String payload = "{\n" +
                "        //    \"firstname\" : \"Ronny\",\n" +
                "        //    \"lastname\" : \"Amrit\"}";

       RequestSpecification RS = RestAssured.given();
                RS.baseUri("https://restful-booker.herokuapp.com");
                RS.basePath("/booking/" +bookingid);
                RS.contentType(ContentType.JSON);
                RS.cookie("token", token);
                RS.body(payload).log().all();

        Response response = RS.when().patch();
        ValidatableResponse VR = response.then().log().all();
        VR.body("firstname", Matchers.equalTo("Ronny"));

    }
}
