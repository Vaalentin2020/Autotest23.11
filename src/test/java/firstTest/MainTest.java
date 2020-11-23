package firstTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
    String login = "supertester";
    String password = "777";
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Test
    public void loginTest(){
        loginPage.testLogin(login, password);
    }
    @Test
    public void checkHomePageUi(){
        homePage.helpButton(login, password);
    }
}

