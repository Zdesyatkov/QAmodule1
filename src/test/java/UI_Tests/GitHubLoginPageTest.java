package UI_Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubLoginPage;

public class GitHubLoginPageTest extends BaseTest{

    @Test
    public void loginOperationWithBadCredentials(){
        GitHubLoginPage gitHubLoginPage = new GitHubLoginPage();
        Selenide.open("/session");
        gitHubLoginPage.authOperation("test@mail.ru", "1234567");
        gitHubLoginPage.isErrorMessage();
    }

}
