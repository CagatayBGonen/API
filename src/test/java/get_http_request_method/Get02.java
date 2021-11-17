package get_http_request_method;

import base_urls.HerOkuAppBaseUrl;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertTrue;

public class Get02 extends HerOkuAppBaseUrl {
    /*
        Given
            https://restful-booker.herokuapp.com/booking/1001
         When
            User send a GET Request to the URL
         Then
            HTTP Status code should be 404
         And
            Status Line should be HTTP/1.1 404 Not Found
         And
            Response body contains "Not Found"
         And
            Response body does not contain "TechProEd"
         And
            Server is "Cowboy"
     */
    //Note: Path Parameters are used to make resource smaller
    @Test
    public void get02Test(){
        //1.step: Set the URL
        //String url = "https://restful-booker.herokuapp.com/booking/1001"; ==> not recommended
        //https://restful-booker.herokuapp.com ==> base URL
        // booking/1001 ==> path parameters ==> it is used make resources smaller!!!!
        spec.pathParams("first","booking","second",1001);

        //2.step: set the expected date

        //3.step: Send the request and get response
        Response response = given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();

        //4.step:
        response.then().assertThat().statusCode(404).statusLine("HTTP/1.1 404 Not Found");

        assertTrue(response.asString().contains("Not Found")); //If response.asString().contains("Not Found") returns true, you will get green tick
    }
}
