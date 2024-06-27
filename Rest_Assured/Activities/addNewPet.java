package examples;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;// Set base URL

import static io.restassured.RestAssured.given;
final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

@Test
public void addNewPet() throws IOException {
    File file = new File("src/test/resources/input.json");

    System.out.println(reqBody);

    Response response = given()
            .contentType(ContentType.JSON) // Set headers
            .body(file) // Pass request body from file
            .when().post(ROOT_URI); // Send POST request

    // Print response
    String body = response.getBody().asPrettyString();
    System.out.println(body);

    inputJSON.close();

    // Assertion
    response.then().body("id", equalTo(77232));
    response.then().body("name", equalTo("Riley"));
}
