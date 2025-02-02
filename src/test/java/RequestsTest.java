import org.springframework.http.HttpStatus;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;


public class RequestsTest {
    @Test
    void getRequest(){
        given()
        .when()
            .get("https://postman-echo.com/get")
        .then()
            .statusCode(200)
            .body("headers.host", equalTo("postman-echo.com"))
            .body("headers.x-request-start", notNullValue())
            .body("headers.connection", equalTo("close"))
            .body("headers.x-forwarded-proto", equalTo("https"))
            .body("headers.x-forwarded-port", equalTo("443"))
            .body("headers.x-amzn-trace-id", notNullValue())
            .body("headers.user-agent", equalTo("Apache-HttpClient/4.5.3 (Java/11.0.0.2)"))
            .body("headers.accept", equalTo("*/*"))
            .body("headers.cache-control", equalTo(null))
            .body("headers.postman-token", equalTo(null))
            .body("headers.cookie", equalTo(null))
            .log().all();
    }

    @Test
    void postFromDataRequest(){

        given().contentType("application/json").body("{\"a\":\"b\"}")
        .when()
            .post("https://postman-echo.com/post")
        .then()
            .statusCode(HttpStatus.OK.value())
            .log().all();
    }

    @Test
    void postRawTextRequest() {
        given().contentType("application/json")
            .formParam("parameter1Name", "Values") // Указываем ключ и значение
            .formParam("age", 30)
        .when()
            .post("https://postman-echo.com/post")
        .then()
            .statusCode(HttpStatus.OK.value())
            .log().all();
    }

    @Test
    void putRequest() {
        String inputTest = "expected response body";
        given()
            .body(inputTest)
        .when()
            .put("https://postman-echo.com/put")
        .then()
            .statusCode(HttpStatus.OK.value())
            .body("data", equalTo(inputTest));
    }

    @Test
    void patchRequest() {
        String inputTest = "expected response body";
        given()
            .body(inputTest)
        .when()
            .patch("https://postman-echo.com/patch")
        .then()
            .statusCode(HttpStatus.OK.value())
            .body("data", equalTo(inputTest));
    }

    @Test
    void deleteRequest() {
        given()
        .when()
            .delete("https://postman-echo.com/delete")
        .then()
            .statusCode(HttpStatus.OK.value());
    }
}
