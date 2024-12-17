import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static Builders.PetStoreDogGenerator.setNewDog;
import static io.restassured.RestAssured.given;

public class PetStoreApiTests {
    @Test
    public void createNewPetIsCode200(){
    given()
            .baseUri("https://petstore.swagger.io/v2")
            .basePath("/pet")
            .contentType(ContentType.JSON)
            .accept(ContentType.JSON)
            .body(setNewDog())
            .when().post()
            .then().log().body().statusCode(200);
    }

    @Test
    public void checkIdPetIs200(){
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/123456")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().get()
                .then().log().body().statusCode(200);
    }

    @Test
    public void deletePetIs200(){
        given()
                .baseUri("https://petstore.swagger.io/v2")
                .basePath("/pet/123456")
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .when().delete()
                .then().log().body().statusCode(200);
    }





}
