import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pogo.GetColorData;
import pogo.GetUsersData;

import java.util.List;

import static apiConf.ApiSpecification.getRequestSpecification;
import static apiConf.ApiSpecification.setSpecification;
import static constants.ReqresInApi.*;
import static io.restassured.RestAssured.given;

public class ReqresInApiTest {
    @Test
    public void getUsersWithCode200(){
        setSpecification(getRequestSpecification(basePathURI, basePathUsers));
        given()
                .when().get()
                .then().log().body().statusCode(200);
    }


    @Test
    public void avatarContainUrl(){
        setSpecification(getRequestSpecification(basePathURI, basePathUsers));
        List<GetUsersData> users = given()
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUsersData.class);

        users.forEach(user -> System.out.println(user.getAvatar()));

        users.forEach(user -> Assertions.assertTrue(user.getAvatar().contains("https://reqres.in")));
    }

    @Test
    public void checkColorsYear(){
        setSpecification(getRequestSpecification(basePathURI, basePathUsersUnknown));
        List<GetColorData> pens = given()
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetColorData.class);

        pens.forEach(pen -> System.out.println(pen.getYear()));
        pens.forEach(pen -> Assertions.assertTrue(pen.getYear()>=2000));
    }

}
