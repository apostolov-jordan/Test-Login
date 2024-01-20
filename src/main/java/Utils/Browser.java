package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Browser {
    private static WebDriver driver;
    private static WebDriverWait waiter;

    public static void setupDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        waiter = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public static void goTo(String url){
        driver.get(url);
    }

    public static WebDriver driverDo() {
        return driver;
    }

    public static WebDriverWait waiterDo() {
        return waiter;
    }
}
