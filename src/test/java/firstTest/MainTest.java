package firstTest;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MainTest {
    String login = "supertester";
    String password = "777";
    //LoginPage loginPage = new LoginPage();
    //HomePage homePage = new HomePage();
    @BeforeSuite
    public void loginTest(){

        LoginPage.loginTest(login, password);
    }
    @Test
    public void checkHomePageUi(){
        HomePage.helpButton();
    }
}

