package ui_tests_v2;

import com.codeborne.selenide.Selenide;

import org.junit.jupiter.api.Test;
import pageObject.GitHubHomePage;


public class GitHubHomePageTest extends BaseTest {
    @Test
    public void contactSales() {
        GitHubHomePage gitHubHomePage = new GitHubHomePage();
        Selenide.open("/");
        gitHubHomePage.operation("Zhenya","Desyatkov");
    }

    @Test
    public void topicsChek(){
        GitHubHomePage solutions = new GitHubHomePage();
        Selenide.open("/");
        solutions.solutionsCheck();
    }


}
