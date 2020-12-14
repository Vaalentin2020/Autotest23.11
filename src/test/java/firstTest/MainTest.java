package firstTest;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static firstTest.CampaignsPage.*;


public class MainTest {
    public String login = "testuser23";
    public String password = "Testuser23!";
    public String companyName = "New company";

    //Вызываем метод класса страницы авторизации

    @BeforeTest                                        /*Аннотация Before для логирования перед основным тестом*/
    public void loginTest(){
        LoginPage.loginTest(login, password);
    }
    //Вызываем метод проверки кнопки Help на главной странице
    @Test(enabled = false)
    public void checkHelpButton(){
        HomePage.helpButton();
    }

    //Вызываем метод проверки смены языка на главной странице
    @Test(enabled = false)
    public void checkLanguageChange(){
        HomePage.languageChange();
    }
    //Вызываем метод, для проверки страницы статистики
    @Test(enabled = false)
    public void checkStatsUI(){
        StatisticPage.StatsPageUi();
    }
    //Вызываем метод проверки возможности создания новой кампании
    @Test
    public void checkCreationNewCampaign(){
            openCampaignPage();
            clickToNewCampaignButton();
            chooseTheLanguage();
            insertNameOfCampaign(companyName);
            uploadTheFile();
            clickCreateButton();
    }
}

