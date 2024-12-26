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
    private static final SelenideElement avatarButton = $(By.xpath("//img[contains(@class, 'avatar circle')]"));
    private static final SelenideElement logoutButton = $("a[href='/logout']");
    private static final SelenideElement signOut = $(By.xpath("//input[contains(@class, 'btn btn-sm m-0')]"));

    public void authOperation(String login, String password){
        setUserLogin(login);
        setUserPassword(password);
        pushSubmitButton();
    }
    public void logoutOperation(){
        pushAvatarButton();
        pushLogoutButton();
        pushSignOut();
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

    public void pushAvatarButton(){
        avatarButton.shouldBe(visible).click();
    }

    public void pushLogoutButton(){
        logoutButton.shouldBe(visible).click();
    }
    public void pushSignOut(){
        signOut.shouldBe(visible).click();
    }

}
