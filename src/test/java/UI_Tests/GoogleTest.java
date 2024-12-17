package UI_Tests;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class GoogleTest extends BaseTestForGoogle{
    @Test
    public void googleSearch1(){
        GoogleHomePage googleHomePage = new GoogleHomePage();
        Selenide.open("/");
        googleHomePage.Seearch("qa");

    }
    @Test
    public void googleSearch2(){
        GoogleHomePage googleHomePage = new GoogleHomePage();
        Selenide.open("/");
        googleHomePage.Seearch("aqa");

    }
    @Test
    public void googleSearch3(){
        GoogleHomePage googleHomePage = new GoogleHomePage();
        Selenide.open("/");
        googleHomePage.Seearch("cars");

    }
}
