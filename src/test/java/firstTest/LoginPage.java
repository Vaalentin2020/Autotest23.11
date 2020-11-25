package firstTest;

import com.codeborne.selenide.*;
import com.codeborne.selenide.conditions.Text;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.sleep;

public class LoginPage {
    public static void loginTest(String login, String password){
        open("https://manager-dev.ar-go.co/#/app/dashboard");
        $(byAttribute("placeholder","Login")).shouldBe(Condition.visible).setValue(login);
        $(byAttribute("ng-model","oUser.password")).shouldBe(Condition.visible).setValue(password);
        $(byAttribute("ng-hide","isLoading")).click();
        sleep(4000);
        $(By.className("help-button")).click();

    }


}
