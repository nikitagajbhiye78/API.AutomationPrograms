package RestassuredBasics;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
public class APITest007_Get_NonBDDStyle {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description("Verify the get request: Correct input")
    @Test
    public void test_get_positive() {
        String pincode = "90210";
         r = RestAssured
                .given();
                r.baseUri("https://api.zippopotam.us");
                r.basePath("/us/"+pincode);
                response = r.when().log().all().get();
               vr =  response.then().log().all().statusCode(200);
    }
    @Description("Verify the get request: Negative input")
    @Test
    public void test_get_negative() {
        // negative testcase
        String Pin_code = "-1";
       r=  RestAssured
                .given();
               r.baseUri("https://api.zippopotam.us");
                r.basePath("/us/" + Pin_code);
              response = r .when().get();
            vr =  response .then().log().all().statusCode(404);
    }
    @Description("Verify the get request: Used special char")
    @Test
    public void test_get_negativeChar() {
        // negative testcase
        String Pin_code = "&*%$@@@@";
        r=  RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/us/" + Pin_code);
        response = r .when().get();
        vr =  response .then().log().all().statusCode(404);
    }
    @Description("Verify the get request: invalid input")
    @Test
    public void test_get_negativeinput() {
        // negative testcase
        String Pin_code = "00000";
        r=  RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/us/" + Pin_code);
        response = r .when().get();
        vr =  response .then().log().all().statusCode(404);
    }
    @Description("Verify the get request: Null value")
    @Test
    public void test_get_negativeValue() {
        // negative testcase
        String Pin_code = "null";
        r=  RestAssured
                .given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/us/" + Pin_code);
        response = r .when().get();
        vr =  response .then().log().all().statusCode(404);
    }
}
