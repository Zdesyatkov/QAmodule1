package ui_tests_v2;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static constants.GitHubLoginPage.BASE_URL;
import static constants.GitHubLoginPage.BROWSER;

public class BaseTest {
    @BeforeAll
    public static void setConfiguration(){
        Configuration.baseUrl = BASE_URL;
        Configuration.browser = BROWSER;
        Configuration.screenshots = false;
        Configuration.savePageSource = false;
    }
}
