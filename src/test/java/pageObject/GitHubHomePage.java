package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GitHubHomePage {
    private static final SelenideElement solutionsButton = $(By.xpath("//nav//li[2]//button"));
    private static final SelenideElement ci_cdButton = $(By.xpath("//nav//ul/li[2]//div[2]//ul/li[3]/a"));
    private static final SelenideElement contactSalesButton = $(By.xpath("//a[2]//span[1][text()='Contact sales']"));
    private static final SelenideElement userFirstName = $(By.name("first_name"));
    private static final SelenideElement userLastName = $(By.name("last_name"));
    private static final SelenideElement resoursesButton = $(By.xpath("//nav//li[3]//button"));
    private static final SelenideElement topicsTable = $(By.xpath("//nav//li[3]//div/div[1]/div/ul"));
    private static final List<String> topicList = Arrays.asList("AI\nDevOps\nSecurity\nSoftware Development\nView all");
    private static final ElementsCollection actualTopics = $$(By.xpath("//nav//li[3]//div/div[1]/div/ul"));



    public void operation(String firstName, String lastName){

        pushSolutionsButton();
        pushCi_cdButton();
        pushContactSalesButton();
        setUserFirstName(firstName);
        setUserLastName(lastName);
        Assertions.assertEquals("Zhenya", firstName, "FirstName Incorrect");
        Assertions.assertEquals("Desyatkov", lastName, "LastName Incorrect");
    }

    public void solutionsCheck(){
        pushResoursesButton();
        checkTopics();
        Assertions.assertEquals(topicList, actualTopics.texts(), "Not Equals");
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
        topicsTable.shouldBe(visible);
    }
}
