package com.pms.RestAssured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class GET_PizzaQueryParam_Right {

    public static void main(String[] args) {
        System.out.println("---------------Query Parameter---------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().queryParam("productName", "VeggieSupreme").when().get("getPizza").then().log().body();
        System.out.println("---------------Query Parameter----------------");
    }
}
