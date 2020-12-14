package firstTest;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class CampaignsPage {
    //Открыть страницу "Компании"
    public static void openCampaignPage() {
        $(byAttribute("translate", "nav.CAMPAIGNS")).click();
    }
    //Клик по кнопке "Создать компанию"
    public static void clickToNewCampaignButton(){
        $(By.cssSelector("#campaign-controler > button")).shouldHave(Condition.text("NEW CAMPAIGN")).click();
    }
    //Выбор языка новой компании(English)
    public static void chooseTheLanguage(){
        $(byAttribute("role", "presentation")).click();
        $(byText("English")).click();
    }
    //Название компании в поле ввода. Название передаем из MainTest
    public static void insertNameOfCampaign(String companyName){
        $(byCssSelector("body > div.modal.fade.ng-scope.ng-isolate-scope.in > div > div > div.modal-body.ng-scope > form > div:nth-child(1) > div.ng-isolate-scope > div > div > div > input")).val(companyName);
    }
    //Загрузка файла
    public static  void uploadTheFile(){
        File file = new File("src/test/java/firstTest/bill.pdf");
        $(byTagName("input")).uploadFile(file);
    }
    //Клик по кнопке "Create"
    public static void clickCreateButton(){
        $(byAttribute("ng-click", "fnSubmitForm(oCampaign)")).click();
    }
}
