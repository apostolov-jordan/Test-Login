package Pages;

import Utils.Browser;
import Utils.Texts.Texts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoggedInPage {
    private static final By LOGGED_IN_SUCCESSFULLY = new By.ByCssSelector("h1.post-title");
    private static final By CONGRATS_MESSAGE = new By.ByClassName("has-text-align-center");
    private static final By LOGOUT_BUTTON = new By.ByClassName("wp-block-button__link");

    public static void verifyPostTitle(){
        Browser.waiterDo().until(ExpectedConditions.titleIs("Logged In Successfully | Practice Test Automation"));
        String postTitle = Browser.driverDo().findElement(LOGGED_IN_SUCCESSFULLY).getText();
        Assert.assertEquals(postTitle, Texts.getLoggedInSuccessfully());
    }
    public static void verifyPostMessage(){
        Browser.waiterDo().until(ExpectedConditions.titleIs("Logged In Successfully | Practice Test Automation"));
        String postText = Browser.driverDo().findElement(CONGRATS_MESSAGE).getText();
        Assert.assertEquals(postText,Texts.getCongratulationsText());
    }
    public static void verifyButtonPresence(){
        Browser.waiterDo().until(ExpectedConditions.elementToBeClickable(LOGOUT_BUTTON));
        WebElement logoutButton = Browser.driverDo().findElement(LOGOUT_BUTTON);
        Assert.assertTrue(logoutButton.isDisplayed());
    }
}
