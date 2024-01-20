import Pages.LoggedInPage;
import Pages.LoginPage;
import Pages.MainPage;
import Utils.Browser;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testLogin {

    @BeforeTest
    public void setup(){
        Browser.setupDriver();
    }

    @Test (testName = "Test Case 1", priority = 1)
    public void testPositiveLogin(){
        goToWebsite();
        LoginPage.inputCorrectCredentials();
        LoginPage.clickSubmitButton();
        LoggedInPage.verifyPostTitle();
        LoggedInPage.verifyPostMessage();
        LoggedInPage.verifyButtonPresence();
    }

    @Test (testName = "Test Case 2", priority = 2)
    public void testNegativeUsername(){
        goToWebsite();
        LoginPage.inputIncorrectUsername();
        LoginPage.clickSubmitButton();
        LoginPage.verifyIncorrectUsername();
    }

    @Test (testName = "Test Case 3", priority = 3)
    public void testNegativePassword(){
        goToWebsite();
        LoginPage.inputIncorrectPassword();
        LoginPage.clickSubmitButton();
        LoginPage.verifyIncorrectPassword();
    }

    @AfterTest
    public void tearDown(){
        Browser.driverDo()
                .quit();
    }

    private void goToWebsite(){
        Browser.goTo("https://practicetestautomation.com/");
        MainPage.clickPracticeItemSection();
        MainPage.clickTestLoginPageLink();
    }
}
