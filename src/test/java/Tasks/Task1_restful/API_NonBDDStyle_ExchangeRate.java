package Tasks.Task1_restful;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class API_NonBDDStyle_ExchangeRate {
    RequestSpecification r;
    Response response;
    ValidatableResponse vr;

    @Description("TC1- Verify currency exchange: USD")
    @Test
    public void test_exchangeC1(){
        // url- https://api.exchangerate-api.com/v4/latest/USD
        // basepath- /v4/latest/USD
        String currency = "USD";
         r = RestAssured.given();
         r.baseUri("https://api.exchangerate-api.com");
         r.basePath("/v4/latest/" +currency);
         response = r.when().log().all().get();
           vr = response.then().log().all().statusCode(200);
    }
    @Description("TC1- Verify currency exchange Value is null")
    @Test
    public void test_exchangeC2(){
        String currency = "Null";
         r = RestAssured.given();
         r.baseUri("https://api.exchangerate-api.com");
         r.basePath("/v4/latest/" +currency);
         response = r.when().log().all().get();
         vr = response.then().log().all().statusCode(200);
    }
    @Description("TC1- Verify currency exchange: any random characters")
    @Test
    public void test_exchangeC3 (){
        String currency = "osmnb";
         r = RestAssured.given();
         r.baseUri("https://api.exchangerate-api.com");
         r.basePath("/v4/latest/" +currency);
         response = r.when().log().all().get();
         vr = response.then().log().all().statusCode(200);
    }
    @Description("TC1-Verify currency exchange: any random characters")
    @Test
    public void test_exchangeC4 (){
        String currency = "927636";
        r = RestAssured.given();
        r.baseUri("https://api.exchangerate-api.com");
        r.basePath("/v4/latest/" +currency);
        response = r.when().log().all().get();
        vr = response.then().log().all().statusCode(200);
    }
    @Description("TC1-Verify currency exchange: any random currencies")
    @Test
    public void test_exchangeC5 (){
        String currency = "USD, INR, BHD";
        r = RestAssured.given();
        r.baseUri("https://api.exchangerate-api.com");
        r.basePath("/v4/latest/" +currency);
        response = r.when().log().all().get();
        vr = response.then().log().all().statusCode(200);
    }

}
