package Tasks.Task1_restful;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class API_BDDStyle {
    @Description("Verify status code shoulod be 200")
    @Test
    public void restful_dev (){
        // url- https://api.restful-api.dev/objects
        // basepath- /objects
        RestAssured
                .given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }
    @Description("Verify status code shoulod not be 404")
    @Test
    public void restful_dev1 (){
        RestAssured
                .given()
                .baseUri("https://api.restful-api.dev")
                .basePath("/objects")
                .when().log().all().get()
                .then().log().all().statusCode(404);
    }

}
