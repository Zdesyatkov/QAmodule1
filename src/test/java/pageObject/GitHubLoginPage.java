package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GitHubLoginPage {
    private static final SelenideElement userLoginInput = $(By.id("login_field"));
    private static final SelenideElement userPasswordInput = $(By.id("password"));
    private static final SelenideElement submitButton = $(By.name("commit"));
    private static final SelenideElement invalidCredErrorMessage = $(By.xpath(".//div[@class=\"js-flash-alert\"]"));

    public void authOperation(String login, String password){
        setUserLogin(login);
        setUserPassword(password);
        pushSubmitButton();
        isErrorMessage();
    }

    public void setUserLogin(String login){
        userLoginInput.shouldBe(visible).setValue(login);
    }

    public void setUserPassword(String password){
        userPasswordInput.shouldBe(visible).setValue(password);
    }

    public void pushSubmitButton(){
        submitButton.shouldBe(visible).click();
    }

    public void isErrorMessage(){
        invalidCredErrorMessage.shouldBe(visible);
    }
}
