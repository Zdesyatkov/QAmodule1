package ui_tests_v2;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedGoogleTest extends BaseTest {
@BeforeAll
public static void setConfiguration(){
    Configuration.baseUrl = "https://www.google.com";
}


    @ParameterizedTest
    @ValueSource(strings = {"qa", "aqa", "cars"})
    public void checkResults(String data) {
        GoogleHomePage googleHomePage = new GoogleHomePage();
        Selenide.open("/");
        googleHomePage.Search(data);


    }


}

