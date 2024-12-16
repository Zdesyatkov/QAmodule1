import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubLoginPage;

public class GitHubLoginPagePozitiveTest extends BaseTest{

    @Test
    public void loginOperationWithGoodCredentials(){
        GitHubLoginPage gitHubLoginPage = new GitHubLoginPage();
        Selenide.open("/session");
        gitHubLoginPage.authOperation("zdesyatkov1998@gmail.com", "Dfccznf89012813544");
    }
}
