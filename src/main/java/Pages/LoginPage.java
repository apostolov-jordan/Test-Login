package Pages;

import Utils.Browser;
import Utils.Messages.ErrorMessages;
import Utils.Texts.TextInput;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginPage {
    private static final By USERNAME_INPUT_FIELD = new By.ById("username");
    private static final By PASSWORD_INPUT_FIELD = new By.ById("password");
    private static final By SUBMIT_BUTTON = new By.ById("submit");
    private static final By ERROR_MESSAGE = new By.ById("error");

    public static void inputCorrectCredentials(){
        Browser.driverDo().findElement(USERNAME_INPUT_FIELD).clear();
        Browser.driverDo().findElement(USERNAME_INPUT_FIELD).sendKeys(TextInput.getCorrectUsername());
        Browser.driverDo().findElement(PASSWORD_INPUT_FIELD).clear();
        Browser.driverDo().findElement(PASSWORD_INPUT_FIELD).sendKeys(TextInput.getCorrectPassword());
    }

    public static void inputIncorrectUsername(){
        Browser.driverDo().findElement(USERNAME_INPUT_FIELD).clear();
        Browser.driverDo().findElement(USERNAME_INPUT_FIELD).sendKeys(TextInput.getIncorrectUsername());
        Browser.driverDo().findElement(PASSWORD_INPUT_FIELD).clear();
        Browser.driverDo().findElement(PASSWORD_INPUT_FIELD).sendKeys(TextInput.getCorrectPassword());
    }

    public static void inputIncorrectPassword(){
        Browser.driverDo().findElement(USERNAME_INPUT_FIELD).clear();
        Browser.driverDo().findElement(USERNAME_INPUT_FIELD).sendKeys(TextInput.getCorrectUsername());
        Browser.driverDo().findElement(PASSWORD_INPUT_FIELD).clear();
        Browser.driverDo().findElement(PASSWORD_INPUT_FIELD).sendKeys(TextInput.getIncorrectPassword());
    }

    public static void clickSubmitButton(){
        Browser.driverDo().findElement(SUBMIT_BUTTON).click();
    }

    public static void verifyIncorrectUsername() {
        WebElement errorMessage = Browser.driverDo().findElement(ERROR_MESSAGE);
        Browser.waiterDo().until(ExpectedConditions.visibilityOf(errorMessage));
        String errorText = errorMessage.getText();
        Assert.assertEquals(errorText, ErrorMessages.getIncorrectUsernameText());
    }

    public static void verifyIncorrectPassword() {
        WebElement errorMessage = Browser.driverDo().findElement(ERROR_MESSAGE);
        Browser.waiterDo().until(ExpectedConditions.visibilityOf(errorMessage));
        String errorText = errorMessage.getText();
        Assert.assertEquals(errorText, ErrorMessages.getIncorrectPasswordText());
    }
}
