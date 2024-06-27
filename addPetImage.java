package examples;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

String ROOT_URI = "https://petstore.swagger.io/v2/pet/{petId}/uploadImage";

public void addPetImage() {
    // Get file to upload
    File petImage = new File("src/test/resources/pet_cat.jpg");
    Response response = given().multiPart(petImage) // Add image to upload
            .pathParam("petId", "77232") // Set petId parameter
            .when().post(ROOT_URI); // Send POST request

    // Print response
    System.out.println(response.asPrettyString());

    // Assertion
    response.then().body("code", equalTo(200));
}
