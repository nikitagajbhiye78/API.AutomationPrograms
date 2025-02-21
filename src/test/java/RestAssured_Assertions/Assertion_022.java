package RestAssured_Assertions;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;
import static org.assertj.core.api.Assertions.*;
public class Assertion_022 {
    @Test
    public void demo(){
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

        // validate the response
        VR.body("firstname", Matchers.equalTo("Ronny"));
        VR.body("lastname", Matchers.equalTo("Amrit"));
        VR.body("bookingid", Matchers.equalTo("1578"));

        // TestnG assertion
        Assert.assertEquals("Ronny", "Ronny");
       Assert.assertNotEquals("Ronny", "Roony");

        // Assertj/
        // need to import -import static org.assertj.core.api.Assertions.*;
        assertThat(token).isNotEqualTo(token).isEmpty();
        assertThat("firstname").isEqualTo("Ronny").doesNotContainAnyWhitespaces().endsWith("y");

    }
}
