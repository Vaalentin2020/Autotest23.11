package firstTest;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;

public class CampaignsPage {
    public static void createNewCampaign(){
        $(byAttribute("translate","nav.CAMPAIGNS")).click();
        sleep(4000);
        $(By.cssSelector("#campaign-controler > button")).click();
        $(byAttribute("accept","application/pdf")).val("C:\\Users\\Public\\Pictures\\Sample Pictures");




    }
}
