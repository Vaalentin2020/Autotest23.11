package firstTest;

import org.junit.Test;

public class MainTest {
    String login = "supertester";
    String password = "777";
    Automation automation = new Automation();
    @Test
    public void loginTest(){
        automation.testLogin(login, password);
    }
}

