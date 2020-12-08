package firstTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CampaignsPage {
    public static void createNewCampaign(){
        $(byAttribute("translate","nav.CAMPAIGNS")).click();
        sleep(4000);
        $(By.cssSelector("#campaign-controler > button")).click();
        $(By.className("select2-selection__placeholder")).click();
        $(byText("English")).click();
        $(byXpath("/html/body/div[1]/div/div/div[2]/form/div[1]/div[2]/div/div/div/input")).val("123");
        $(byAttribute("accept","application/pdf")).uploadFromClasspath("https://topdnb.com/wp-content/uploads/2013/06/maxresdefault-55.jpg");

       // C:\Users\Public\Pictures\Sample Pictures


    }
}
