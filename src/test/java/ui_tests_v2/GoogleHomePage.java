package ui_tests_v2;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;


public class GoogleHomePage {
    private static final SelenideElement strGoogleSearch = $(By.id("APjFqb"));
    private static final ElementsCollection results = $$(By.xpath(".//ul[@class='G43f7e']/li"));
    private static final SelenideElement resultsElement2 = $(By.xpath(".//ul[@class='G43f7e']/li[2]"));

    public void Search(String str){
        setGoogleSearch(str);
        Assertions.assertTrue(results.size()>5);
    }

    public void setGoogleSearch(String str){
        strGoogleSearch.shouldBe(visible).setValue(str);
        resultsElement2.shouldBe(visible);
    }
}
