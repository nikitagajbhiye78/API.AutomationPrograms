package RestAssured_Post;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting009_Post_BDDStyle {
   @Description("Verify token should generate")
   @Test
    public void post_test (){
        //https://restful-booker.herokuapp.com/auth
       // Body { "username" : "admin",
       //    "password" : "password123"}
       // Content-Type

       String payload = "{\n" +
               "    \"username\" : \"admin\",\n" +
               "    \"password\" : \"password123\"\n" +
               "}";
       RestAssured.given()
               .baseUri("https://restful-booker.herokuapp.com")
               .basePath("/auth")
               .contentType(ContentType.JSON)
               .log().all().body(payload)

               .when().log().all().post()

               .then().log().all().statusCode(200);
   }

}
