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

public class Automation {

    public void testLogin(String login, String password) {
        Selenide.open("https://manager-dev.ar-go.co/#/account/signin");
        $(byAttribute("placeholder","Login")).shouldBe(Condition.visible).setValue(login);
        $(byAttribute("ng-model","oUser.password")).shouldBe(Condition.visible).setValue(password);
        $(byAttribute("ng-hide","isLoading")).click();
        sleep(4000);
        $("#logo").shouldBe(Condition.visible);
    }
}


