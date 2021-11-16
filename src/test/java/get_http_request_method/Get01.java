package get_http_request_method;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class Get01 {
    /*
        we will use Gherkin Language
        In Gherkin Language we use some keywords : Given, When, Then, And
        Given : It declares pre-requesites
        When : It is used to declare actions
        Then : It is for outputs
        And : It is used for multiple Given, When, Then
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

        //1)Set the url
        String url = "https://restful-booker.herokuapp.com/booking/3"; //primitive way to do it

        //2)Set the accpeted data

        //3)Type automation script to send GET Request and to get response
        Response response = given().when().get(url);
        response.prettyPrint(); // for seeing response on consol

        //4)Do assertion

    }













}
