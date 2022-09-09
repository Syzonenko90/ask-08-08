package objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static support.TestContext.getDriver;

public class mainePageTeacher {
    private static WebElement element = null;


    public static WebElement GoToSubmissionsLink () {
        element = getDriver().findElement(By.xpath("//span[contains(text(),'Go To Submissions')]"));
        return element;
    }
    public static WebElement GoToAssignmentsLink () {
        element = getDriver().findElement(By.xpath("//span[contains(text(),'Go To Assignments')]"));
        return element;
    }
    public static WebElement GoToUsersManagementLink(){
        element = getDriver().findElement(By.xpath("//span[contains(text(),'Go To Users Management')]"));
        return element;
    }
    public static WebElement QuizzesButton () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Quizzes')]"));
        return element;
    }
    public static WebElement HomeBtn () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Home')]"));
        return element;
    }
    public static WebElement SubmissionsBtn () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Submissions')]"));
        return element;
    }
    public static WebElement AssigmentsBtn () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]"));
        return element;
    }
    public static WebElement UsersManagment () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),\"User's Management\")]"));
        return element;
    }
    public static WebElement SettingsBtn () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Settings')]"));
        return element;
    }
    public static WebElement LogOutBtn () {
        element = getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]"));
        return element;
    }
}
