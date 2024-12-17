package UI_Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import pageObject.GitHubHomePage;


public class GitHubHomePageTest extends BaseTest {
    @Test
    public void contactSales() {
        GitHubHomePage gitHubHomePage = new GitHubHomePage();
        Selenide.open("/");
        gitHubHomePage.Operation("Zhenya","Desyatkov");
    }

    @Test
    public void topikChek(){
        GitHubHomePage solutions = new GitHubHomePage();
        Selenide.open("/");
        solutions.SolutionsCheck();

    }



}
