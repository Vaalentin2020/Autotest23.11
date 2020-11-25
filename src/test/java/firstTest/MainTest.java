package firstTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
    String login = "supertester";
    String password = "777";
    //Мы вызываем методы напрямую,без создания их экземпляров
    //LoginPage loginPage = new LoginPage();
    //HomePage homePage = new HomePage();

    //Вызываем метод класса страницы авторизации
    @BeforeSuite
    public void loginTest(){
        LoginPage.loginTest(login, password);
    }
    //Вызываем метод проверки кнопки Help на главной странице
    @Test
    public void checkHomePageUi(){
        HomePage.helpButton();
    }
    //Вызываем метод проверки смены языка на главной странице
    @Test
    public void checkLanguageChange(){
        HomePage.languageChange();
    }
}

