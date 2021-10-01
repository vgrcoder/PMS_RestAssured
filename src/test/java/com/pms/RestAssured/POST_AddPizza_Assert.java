package com.pms.RestAssured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class POST_AddPizza_Assert {

    public static void main(String[] args) {
        System.out.println("---------------POST Add Pizza---------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().header("Content-Type", "application/json").body("{\n" +
                "    \"productName\":\"FishPizza\",\n" +
                "    \"productPrice\" :\"600\"\n" +
                "}").when().post("addPizza").then().log().all().assertThat().statusCode(201);
        System.out.println("---------------POST Add Pizza----------------");
    }
}
