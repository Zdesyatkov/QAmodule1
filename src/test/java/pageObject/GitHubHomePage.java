package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GitHubHomePage {
    private static final SelenideElement solutionsButton = $(By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/nav/ul/li[2]/button"));
    private static final SelenideElement ci_cdButton = $(By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/nav/ul/li[2]/div/div[1]/div[2]/ul/li[3]/a"));
    private static final SelenideElement contactSalesButton = $(By.xpath("//*[@id=\":R1b:\"]/section/div/div/div/div[2]/section/div/div[1]/div/div/a[2]/span[1]/span"));
    private static final SelenideElement userFirstName = $(By.name("first_name"));
    private static final SelenideElement userLastName = $(By.name("last_name"));
    private static final SelenideElement resoursesButton = $(By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/nav/ul/li[3]/button"));
    private static final SelenideElement topicsTable = $(By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/nav/ul/li[3]/div/div[1]/div/ul"));


    public void Operation(String firstName, String lastName){

        pushSolutionsButton();
        pushCi_cdButton();
        pushContactSalesButton();
        setUserFirstName(firstName);
        setUserLastName(lastName);
        Assertions.assertEquals("Zhenya", firstName, "FirstName Incorrect");
        Assertions.assertEquals("Desyatkov", lastName, "LastName Incorrect");
    }

    public void SolutionsCheck(){
        pushResoursesButton();
        checkTopics();
    }



    public void pushSolutionsButton(){
        solutionsButton.shouldBe(visible).click();
    }

    public void pushCi_cdButton(){
        ci_cdButton.shouldBe(visible).click();
    }

    public void pushContactSalesButton(){
        contactSalesButton.shouldBe(visible).click();
    }

    public void setUserFirstName(String firstName){
        userFirstName.shouldBe(visible).setValue(firstName);
    }

    public void setUserLastName(String lastName){
        userLastName.shouldBe(visible).setValue(lastName);
    }

    public void pushResoursesButton(){
        resoursesButton.shouldBe(visible).click();
    }

    public void checkTopics(){
        topicsTable.shouldBe(visible).shouldHave(
                text("AI"),
                text("DevOps"),
                text("Security"),
                text("Software Development"),
                text("View All"));
    }
}
