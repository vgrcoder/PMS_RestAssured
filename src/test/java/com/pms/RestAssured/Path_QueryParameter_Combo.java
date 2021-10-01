package com.pms.RestAssured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class Path_QueryParameter_Combo {

    public static void main(String[] args) {

        //Path Parameter
        System.out.println("-----------------Path Parameter-----------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().when().get("/getPizza/VeggieSupreme0").then().log().body();
        System.out.println("-----------------Path Parameter---------------");

        System.out.println("---------------Query Parameter---------------------");
        RestAssured.baseURI="http://localhost:8080/";
        given().when().get("/getPizza?productName=VeggieSupreme").then().log().body();
        System.out.println("---------------Query Parameter----------------");
    }
}
