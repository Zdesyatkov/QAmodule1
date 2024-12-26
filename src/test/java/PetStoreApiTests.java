
import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


import static apiConf.ApiSpecification.getRequestSpecification;
import static apiConf.ApiSpecification.setSpecification;
import static buildersNew.PetStoreDogGenerator.setNewDog;
import static constants.PetStoreApi.*;
import static io.restassured.RestAssured.given;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PetStoreApiTests {


    @Test
    @Order(1)
    public void checkCreateNewPetWithCode200() {
        setSpecification(getRequestSpecification(baseURI, basePathPet));
        given()
                .body(setNewDog())
                .when().post()
                .then().log().body().statusCode(200);
    }


    @Test
    @Order(2)
    public void getPetWithValidId() {
        setSpecification(getRequestSpecification(baseURI, basePathPetWithID));
        given()
                .when().get()
                .then().log().body().statusCode(200);
    }


    @Test
    @Order(3)
    public void deletePetIs200() {
        setSpecification(getRequestSpecification(baseURI, basePathPetWithID));
        given()
                .when().delete()
                .then().log().body().statusCode(200);
    }
    @Test
    @Order(4)
    public void checkAuthorizationWithInvalidCred(){
        setSpecification(getRequestSpecification(baseURI, basePathPetWithInvalide));
        given()
                .when().get()
                .then().assertThat().body("type", CoreMatchers.equalTo("unknown"));

    }
}

