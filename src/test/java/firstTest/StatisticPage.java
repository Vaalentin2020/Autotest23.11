package firstTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class StatisticPage {
    public static void StatsPageUi(){
        $(byAttribute("translate", "nav.STATS")).click();
        $(By.id("usersCntChart")).shouldBe(Condition.visible);
        $(By.linkText("Marker's ranking")).shouldBe(Condition.visible);
        $(byAttribute("translate", "dashboard.MARKER_RANKING")).shouldHave(Condition.text("Marker's ranking"));
    }
}
