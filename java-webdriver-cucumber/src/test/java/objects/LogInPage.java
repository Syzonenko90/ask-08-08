package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static support.TestContext.getDriver;

public class LogInPage {
    private static WebElement element = null;

    public static WebElement emailField () {
        element = getDriver().findElement(By.xpath("//input[@formcontrolname='email']"));
        return element;
    }
    public static WebElement passwordField () {
        element = getDriver().findElement(By.xpath("//input[@formcontrolname='password']"));
        return element;
    }
    public static WebElement signInBUtton () {
        element = getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]"));
        return element;
    }
}
