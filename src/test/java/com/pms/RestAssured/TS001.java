package com.pms.RestAssured;

import static io.restassured.RestAssured.given;

public class TS001 {

    public static void main(String[] args) {

        given().when().get("http://localhost:8080/getPizza/VeggieSupreme0").then().log().body();
    }
}
