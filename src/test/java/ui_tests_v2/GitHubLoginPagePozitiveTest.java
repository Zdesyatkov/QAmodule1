package ui_tests_v2;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubLoginPage;

import static constants.GitHubLoginPage.*;

public class GitHubLoginPagePozitiveTest extends BaseTest{

    @Test
    public void loginOperationWithGoodCredentials(){
        GitHubLoginPage gitHubLoginPage = new GitHubLoginPage();
        Selenide.open(BASE_PATH);
        gitHubLoginPage.authOperation(POZITIVE_EMAIL, POZITIVE_PASSWORD);
        gitHubLoginPage.logoutOperation();
    }
}
