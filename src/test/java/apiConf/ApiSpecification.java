package apiConf;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;


import static io.restassured.http.ContentType.JSON;

public class ApiSpecification {
    public static RequestSpecification getRequestSpecification(String baseUrl, String basePath) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUrl)
                .setBasePath(basePath)
                .setAccept(JSON)
                .setContentType(JSON)
                .build();
    }



    public static void setSpecification(RequestSpecification requestSpecification) {
        RestAssured.requestSpecification = requestSpecification;
    }
}
