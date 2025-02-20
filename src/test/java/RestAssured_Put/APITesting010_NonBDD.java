package RestAssured_Put;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting010_NonBDD {
    @Description("Verify put req for restful APIs ")
    @Test
    public void Test_CreateBooking(){
        // Baseuri- https://restful-booker.herokuapp.com
        // BasePath - /booking
        // body- {
        //    "firstname" : "Ronnny",
        //    "lastname" : "Govind",
        //    "totalprice" : 111,
        //    "depositpaid" : true,
        //    "bookingdates" : {
        //        "checkin" : "2018-01-01",
        //        "checkout" : "2019-01-01"},
        //    "additionalneeds" : "Breakfast"}
        // Cookies = token
        String payload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}";
          String token = "93dabf77e81a51e";
          String BookingId = "5251";

          RequestSpecification r= RestAssured.given();
               r .baseUri("https://restful-booker.herokuapp.com");
               r.basePath("/booking/" +BookingId);
               r.contentType(ContentType.JSON);
               r.cookie("token",token);
               r.body(payload).log().all();

               // Sending the PUT Request
               Response response = r.when().put();

               // Validating the Response
               ValidatableResponse VR = response.then().log().all();

    }
}
