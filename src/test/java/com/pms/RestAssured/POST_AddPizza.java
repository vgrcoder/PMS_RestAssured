package com.pms.RestAssured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class POST_AddPizza {

    public static void main(String[] args) {
        System.out.println("---------------POST Add Pizza---------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().header("Content-Type", "application/json").body("{\n" +
                "    \"productName\":\"ChickenPizza\",\n" +
                "    \"productPrice\" :\"700\"\n" +
                "}").when().post("addPizza").then().log().all();
        System.out.println("---------------POST Add Pizza----------------");
    }
}
