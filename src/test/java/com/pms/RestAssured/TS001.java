package com.pms.RestAssured;

import static io.restassured.RestAssured.given;

//Given -- all input details
//When  -- Submit the API - End Point, Http Method
//Then  -- Validate the response

/*
 * Set up the REST ASSURED Project
 *
 * STEP01. CREATE A MAVEN PROJECT STEP02. UPDATE the POM.xml file with the following dependecies
 * RestAssured
 * JSON Path
 * XML Path
 * JSON Schema Validator
 *
 * STEP03. Import the following package in the Test
 * import static io.restassured.RestAssured.*;
 */

public class TS001 {

    public static void main(String[] args) {

        given().when().get("http://localhost:8080/getPizza/VeggieSupreme0").then().log().body();
    }
}
