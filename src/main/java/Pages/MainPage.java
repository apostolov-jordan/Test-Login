package Pages;

import Utils.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage {
    private static final By PRACTICE_ITEM = new By.ById("menu-item-20");
    private static final By TEST_LOGIN_PAGE_BUTTON = new By.ByCssSelector("a[href*=\"login\"]");

    public static void clickPracticeItemSection(){
        Browser.waiterDo().until(ExpectedConditions.presenceOfElementLocated(PRACTICE_ITEM));
        Browser.driverDo().findElement(PRACTICE_ITEM).click();
    }

    public static void clickTestLoginPageLink(){
        Browser.waiterDo().until(ExpectedConditions.presenceOfElementLocated(TEST_LOGIN_PAGE_BUTTON));
        Browser.driverDo().findElement(TEST_LOGIN_PAGE_BUTTON).click();
    }


}