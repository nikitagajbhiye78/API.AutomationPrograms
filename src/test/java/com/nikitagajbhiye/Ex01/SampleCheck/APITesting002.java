package com.nikitagajbhiye.Ex01.SampleCheck;

import io.restassured.RestAssured;

public class APITesting002 {
    public static void main(String[] args) {

        // Gherkins syntax
        // given -- Pre req.
        // when -- HTTP Methods -- Get, post, put, delete, update
        // then -- Validations
        // https://api.zippopotam.us/us/90210
        // path url /us/90210

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/us/90210")
                .when()
                .get()
                .then().log().all().statusCode(200);

    }
}
