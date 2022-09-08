package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static support.TestContext.getDriver;

public class QuizzesPage {
    private static WebElement element = null;
    private static List<WebElement> elements = null;

    public static WebElement CreateNewQuizzButton () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]"));
        return element;
    }
    public static List<WebElement> ListOfQuizzes () {
        elements = getDriver().findElements(By.xpath("//mat-expansion-panel"));
        return elements;
    }
    public static WebElement QuizzFromList (String quizName) {
        element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+quizName+"')]"));
        return element;
    }
    public static WebElement QuizzMenu (String quizName) {
        element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+quizName+"')]"));
        return element;
    }
    public static WebElement QuizzMenuPreview (String quizName) {
        element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+quizName+"')]/ancestor::mat-expansion-panel-header/following-sibling::div/div/div/div/button[1]"));
        return element;
    }
    public static WebElement QuizMenuEdit (String quizName) {
        element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+quizName+"')]/ancestor::mat-expansion-panel-header/following-sibling::div/div/div/div/a"));
        return element;
    }
    public static WebElement QuizzMenuDelete (String quizName) {
        element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+quizName+"')]/ancestor::mat-expansion-panel-header/following-sibling::div/div/div/div/button[2]"));
        return element;
    }

}
