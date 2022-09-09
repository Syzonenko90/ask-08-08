package objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static support.TestContext.getDriver;

public class QuizzBuilder {
  private static WebElement element = null;

  public static WebElement TitleOfTheQuizz () {
      element = getDriver().findElement(By.xpath("//input"));
      return element;
  }
  public static WebElement BackToQuizzesButton () {
      element = getDriver().findElement(By.xpath("//span[contains(text(),'Back To Quizzes List')]"));
      return element;
  }
  public static WebElement AddQuestionButton () {
      element = getDriver().findElement(By.xpath("//div/button/span/mat-icon"));
      return element;
  }
  public static WebElement QuizzTypeTextualRadioBtn (int questionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//following-sibling::div[contains(text(),'Textual')]//ancestor::label/div[1]/div[2]"));
      return element;
  }
    public static WebElement QuizzTypeSingleChoiceRadioBtn (int questionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//following-sibling::div[contains(text(),'Single-Choice')]//ancestor::label/div[1]/div[2]"));
      return element;
    }
    public static WebElement QuizzTypeMultipleChoiceRadioBtn (int questionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//following-sibling::div[contains(text(),'Multiple-Choice')]//ancestor::label/div[1]/div[2]"));
      return element;
    }
    public static WebElement QuestionName (int questionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//following-sibling::textarea[@placeholder='Question *']"));
      return element;
    }
    public static WebElement QuestionOptionBtn (int questionNumber, String optionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//label[contains(text(),'Option "+optionNumber+"*')]/ancestor::mat-radio-group//div[@class='mat-radio-inner-circle']"));
      return element;
    }
    public static WebElement OptionFiled (int questionNumber, String optionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//following-sibling::textarea[@placeholder='Option "+optionNumber+"*']"));
      return element;
    }
    public static WebElement Question (int questionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]"));
      return element;
    }
    public static WebElement SaveBtn () {
      element = getDriver().findElement(By.xpath("//span[contains(text(),'Save')]"));
      return element;
    }
    public static WebElement IncludeOtherBtn (int questionNumber) {
      element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//div[@class='checkbox'][1]"));
      return element;
    }
    public static WebElement AddOptionBtn () {
      element = getDriver().findElement(By.xpath("//span[contains(text(),'Add Option')]"));
      return element;
  }
  public static WebElement PointsPerQuestionSlider (int questionNumber) {
    element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q"+questionNumber+"')]/ancestor::mat-expansion-panel//mat-slider/div/div/div[@class='mat-slider-thumb']"));
    return element;
  }
  public static WebElement IsShowStopperChkBox () {
    element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q1')]/ancestor::mat-expansion-panel//div[@class='checkbox'][2]"));
    return element;
  }
  public static WebElement DeleteQuestionBtn () {
    element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q1')]/ancestor::mat-expansion-panel//span[contains(text(),'Delete')]"));
    return element;
  }
  public static WebElement MoveQuestionDwonBtn () {
    element = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q1')]/ancestor::mat-expansion-panel//span[contains(text(),'Move')]"));
    return element;
  }

}
