package firstTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideWait;
import com.codeborne.selenide.conditions.Text;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class HomePage {
    public void helpButton(String login, String password){
        Selenide.open("https://manager-dev.ar-go.co/#/app/dashboard");
        $(byAttribute("placeholder","Login")).shouldBe(Condition.visible).setValue(login);
        $(byAttribute("ng-model","oUser.password")).shouldBe(Condition.visible).setValue(password);
        $(byAttribute("ng-hide","isLoading")).click();
        sleep(4000);
        $(By.className("help-button")).click();
        url().equals("https://support.ar-go.co/hc/en-us");

    }

}
