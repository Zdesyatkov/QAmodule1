import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;


import static apiConf.ApiSpecification.getRequestSpecification;
import static apiConf.ApiSpecification.setSpecification;
import static buildersNew.PetStoreDogGenerator.setNewDog;
import static io.restassured.RestAssured.given;

public class PetStoreApiTests {
    private static final String baseURI = "https://petstore.swagger.io/v2";
    private static final String basePathPet = "/pet";
    private static final String basePathPetWithID = "/pet/123456";


    @Test
    public void createNewPetIsCode200() {
        setSpecification(getRequestSpecification(baseURI, basePathPet));
        given()
                .body(setNewDog())
                .when().post()
                .then().log().body().statusCode(200);
    }

    @Test
    public void checkIdPetIs200() {
        setSpecification(getRequestSpecification(baseURI, basePathPetWithID));
        given()
                .when().get()
                .then().log().body().statusCode(200);
    }

    @Test
    public void deletePetIs200() {
        setSpecification(getRequestSpecification(baseURI, basePathPetWithID));
        given()
                .when().delete()
                .then().log().body().statusCode(200);
    }

}
