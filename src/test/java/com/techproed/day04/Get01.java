package com.techproed.day04;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get01 {
    /*
    https://restful-booker.herokuapp.com/booking/3 adresine bir request
    gonderildiginde donecek cevap(response) icin
 HTTP status kodunun 200
 Content Type’in Json
 Ve Status Line’in HTTP/1.1 200 OK
Oldugunu test edin.
     */
    /*
    Given
        https://restful-booker.herokuapp.com/booking/3
    When
        user send a GET request to the url
    Then
        HTTP Status Code should be 200
    And
        Content Type should be JSON
    And
        Status Line should be HTTP/1.1 200 OK
     */
    @Test
    public void get01Test(){
        //1-url(endpoint) olustur
        String url = "https://restful-booker.herokuapp.com/booking/3";
        //2-set the expected data

        //3-send a request
        Response response = given().
                accept(ContentType.JSON). //accept("application/json") can also be used
                when().
                get(url);
        response.prettyPrint(); // to print in consol
        //4-actual result olustur
        //simdilik bir islem yapmiyoruz
        //5-dogrulama(assertations)
        System.out.println("Status Code is "+response.getStatusCode());
        System.out.println("Status Line is "+response.getStatusLine());
        System.out.println("Content Type is "+response.getContentType());
        System.out.println("Time is "+response.getTime());
        System.out.println("Headers are \n"+response.getHeaders()); // all block
        System.out.println("Via is "+response.getHeader("Via"));
        response.then().
                assertThat().
                statusCode(200).
                contentType("application/json").
                statusLine("HTTP/1.1 200 OK");

    }
}
