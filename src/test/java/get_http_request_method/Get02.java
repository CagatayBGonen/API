package get_http_request_method;

import org.junit.Test;

public class Get02 {
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
    @Test
    public void get02Test(){
        //1.step: Set the URL
        String url = "https://restful-booker.herokuapp.com/booking/1001";
    }
}
