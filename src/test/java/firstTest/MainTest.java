package firstTest;

import org.testng.annotations.Test;

public class MainTest {
    String login = "supertester";
    String password = "777";
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @Test
    public void loginTest(){

        loginPage.loginTest(login, password);
    }
    @Test
    public void checkHomePageUi(){
        homePage.helpButton();
    }
}

