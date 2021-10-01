package com.pms.RestAssured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;

public class POST_AddPizza_CustomHeader {

    public static void main(String[] args) {
        System.out.println("---------------POST Add Pizza with Custom Header---------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().header("Content-Type", "application/json").body("{\n" +
                "    \"productName\":\"FishPizza\",\n" +
                "    \"productPrice\" :\"600\"\n" +
                "}").when().post("addPizza").then().log().all().assertThat().statusCode(201)
                //.header("Unique", "FishPizza5");
                .header("Unique", containsString("FishPizza")).body("response_msg",equalTo("Success: New Pizza Added"));
        System.out.println("---------------POST Add Pizza with Custom Header----------------");
    }
}
