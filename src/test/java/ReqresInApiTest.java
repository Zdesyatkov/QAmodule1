import io.restassured.http.ContentType;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pogo.GetColorData;
import pogo.GetUsersData;

import java.util.List;

import static io.restassured.RestAssured.given;

public class ReqresInApiTest {
    @Test
    public void getUsersWithCode200(){
        given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/users?page=2")
                .when().get()
                .then().log().body().statusCode(200);
    }


    @Test
    public void avatarContainUrl(){
        List<GetUsersData> users = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/users?page=2")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetUsersData.class);

        users.forEach(user -> System.out.println(user.getAvatar()));

        users.forEach(user -> Assertions.assertTrue(user.getAvatar().contains("https://reqres.in")));
    }

    @Test
    public void checkColorsYear(){
        List<GetColorData> pens = given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://reqres.in/api")
                .basePath("/unknown")
                .when().get()
                .then().log().body().extract().jsonPath().getList("data", GetColorData.class);

        pens.forEach(pen -> System.out.println(pen.getYear()));
        pens.forEach(pen -> Assertions.assertTrue(pen.getYear()>=2000));
    }

    @Test
    public void checkAuthorization(){

                given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .baseUri("https://petstore.swagger.io/v2/")
                .basePath("/user/login?username=zdes&password=123")
                .when().get()
                .then().assertThat().body("type", CoreMatchers.equalTo("unknown"));

    }


}
