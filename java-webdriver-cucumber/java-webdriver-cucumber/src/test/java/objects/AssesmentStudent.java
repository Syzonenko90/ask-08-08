package objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;

public class AssesmentStudent {
    private static WebElement element = null;

    public static WebElement radioBtn (int optionNumber, int questionNumber) {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Question "+questionNumber+"')]/ancestor::mat-card//div/mat-radio-group/mat-radio-button["+optionNumber+"]/label/div/div[2]"));
        return element;
    }
    public static WebElement textArea (int questionNumber) {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Question 1')]/ancestor::mat-card//textarea"));
        return element;
    }
    public static WebElement checkBox (int questionNumber, int optionNumber) {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Question "+questionNumber+"')]/ancestor::mat-card//mat-checkbox["+optionNumber+"]/label/div"));
        return element;
    }
}
