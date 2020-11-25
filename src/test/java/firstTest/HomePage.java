package firstTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HomePage {
    public static void helpButton(){
        $(By.className("help-button")).click();
        url().equals("https://support.ar-go.co/hc/en-us");
    }
    public static void languageChange(){
        $(By.className("thumbnail-user")).click();
        $(byAttribute("translate", "users.MANAGEACCOUNT")).click();
        $(byAttribute("ng-bind", "selectLang")).click();
        $(byAttribute("ng-click", "fnSetLanguage(key)")).click();
        $(By.className("modal-title ng-scope")).shouldBe(Condition.visible);
    }

}
