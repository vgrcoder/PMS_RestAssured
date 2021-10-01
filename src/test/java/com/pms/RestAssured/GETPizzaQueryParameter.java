package com.pms.RestAssured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class GETPizzaQueryParameter {

    public static void main(String[] args) {
        //Using Query Parameter

        System.out.println("----------------------------------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().when().get("/getPizza?productName=VeggieSupreme").then().log().body();
        System.out.println("----------------------------------------------");
    }
}
