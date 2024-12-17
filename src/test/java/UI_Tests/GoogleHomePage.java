package UI_Tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.collections.SizeGreaterThan;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleHomePage {
    private static final SelenideElement strGoogleSearch = $(By.xpath("//*[@id=\"APjFqb\"]"));
    private static final ElementsCollection searchTable = $$(By.xpath("//*[@id=\"Alh6id\"]/div[1]/div/ul/li"));


    public void Seearch(String str){
        setGoogleSearch(str);

        searchTable.shouldHave(new SizeGreaterThan(5));
    }


    public void setGoogleSearch(String str){
        strGoogleSearch.shouldBe(visible).setValue(str);
    }



}
