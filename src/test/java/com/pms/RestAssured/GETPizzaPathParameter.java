package com.pms.RestAssured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class GETPizzaPathParameter {

    public static void main(String[] args) {
        //

        System.out.println("----------------------------------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().when().get("/getPizza/VeggieSupreme0").then().log().body();
        System.out.println("----------------------------------------------");
    }
}
