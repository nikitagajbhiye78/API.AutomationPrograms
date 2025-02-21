package Payload_Manangement;

import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class APITesting024_RestAssured_Payload_Map {
    @Test
    public void Test_CreateBooking(){

          // String payload = "{\n" +
          //      "    \"firstname\" : \"Jim\",\n" +
          //        "    \"lastname\" : \"Brown\",\n" +
          //        "    \"totalprice\" : 111,\n" +
          //        "    \"depositpaid\" : true,\n" +
          //        "    \"bookingdates\" : {\n" +
          //        "        \"checkin\" : \"2018-01-01\",\n" +
          //        "        \"checkout\" : \"2019-01-01\"\n" +
          //       "    },\n" +
          //       "    \"additionalneeds\" : \"Breakfast\"\n" +
          //       "}";

        Map<String, Object> JesonBodyUsingMap = new LinkedHashMap();
        JesonBodyUsingMap.put("firstname", "Ronny");
        JesonBodyUsingMap.put("lastname", "Govind");
        JesonBodyUsingMap.put("totalprice", 111);
        JesonBodyUsingMap.put("depositpaid", true);
        JesonBodyUsingMap.put("additionalneeds", "Breakfast");

        Map<String, Object> BookingDatesMap = new LinkedHashMap();
        BookingDatesMap.put("checkin", "2018-01-01");
        BookingDatesMap.put("checkout", "2019-01-01");

        JesonBodyUsingMap.put("bookingdates" , BookingDatesMap);
        System.out.println(JesonBodyUsingMap);

        //  String token = "93dabf77e81a51e";
        //  String BookingId = "5251";
        // RequestSpecification r= RestAssured.given();
        // r .baseUri("https://restful-booker.herokuapp.com");
        // r.basePath("/booking/" +BookingId);
        // r.contentType(ContentType.JSON);
        // r.cookie("token",token);
        //r.body(payload).log().all();

        // Sending the PUT Request
        // Response response = r.when().put();

        // Validating the Response
        //ValidatableResponse VR = response.then().log().all();

    }
}


