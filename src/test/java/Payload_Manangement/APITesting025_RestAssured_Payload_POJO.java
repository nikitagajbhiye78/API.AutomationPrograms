package Payload_Manangement;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting025_RestAssured_Payload_POJO {
    @Test
    public void demo(){
        Booking booking = new Booking();
        booking.setFirstname("Nikita");
        booking.setLastname("Gajbhiye");
        booking.setTotalprice(111);
        booking.setDepositpaid(true);
        booking.setAdditionalneeds("Breakfast");

        BookingDates bookingdates = new BookingDates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckin("2019-01-01");
       // booking.setBookingdates(bookingdates);
       // this correct command not above string.valueOf-- booking.setBookingdates(bookingdates);

        System.out.println(booking);

        String token = "8455ab65fa8998c";
        String BookingId = "2822";
        RequestSpecification r= RestAssured.given();
         r .baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/" +BookingId);
        r.contentType(ContentType.JSON);
        r.cookie("token",token);
        r.body(booking).log().all();

        //Sending the PUT Request
         Response response = r.when().put();

        // Validating the Response
        ValidatableResponse VR = response.then().statusCode(200).log().all();


    }

}
