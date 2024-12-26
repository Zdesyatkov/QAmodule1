package ui_tests_v2;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubLoginPage;

import static constants.GitHubLoginPage.*;


public class GitHubLoginPageTest extends BaseTest{

    @Test
    public void loginOperationWithBadCredentials(){
        GitHubLoginPage gitHubLoginPage = new GitHubLoginPage();
        Selenide.open(BASE_PATH);
        gitHubLoginPage.authOperation(TEST_EMAIL, TEST_PASSWORD);
        gitHubLoginPage.isErrorMessage();
    }

}
