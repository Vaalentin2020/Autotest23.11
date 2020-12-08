package firstTest;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    public String login = "supertester";
    public String password = "777";
    //Мы вызываем методы напрямую,без создания их экземпляров
    //LoginPage loginPage = new LoginPage();
    //HomePage homePage = new HomePage();

    //Вызываем метод класса страницы авторизации

    @BeforeTest
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
        CampaignsPage.createNewCampaign();

    }
}

