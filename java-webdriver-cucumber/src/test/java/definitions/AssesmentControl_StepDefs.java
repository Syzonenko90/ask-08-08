package definitions;

import Data.Data;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.mainePageTeacher;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static support.TestContext.getDriver;

public class AssesmentControl_StepDefs {
    @Given("I open page {string}")
    public void iOpen(String url) {
        getDriver().get(url);
    }

    @When("I log in as Teacher")
    public void iLogInAsTeacher() throws InterruptedException {
        objects.LogInPage.emailField().sendKeys(Data.emailTeacher());
        objects.LogInPage.passwordField().sendKeys(Data.passwordTeacher());
        objects.LogInPage.signInBUtton().click();
        Thread.sleep(2000);

    }

    @And("I log in as Student")
    public void iLogInAsStudent() throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@formcontrolname=\"email\"]")).sendKeys(Data.emailStudent());
        getDriver().findElement(By.xpath("//input[@type=\"password\"]")).sendKeys(Data.passwordStudent());
        getDriver().findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
        Thread.sleep(3000);
    }

    @And("I click My Assigments button")
    public void iClickMyAssigmentsButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Assignments')]")).click();
        Thread.sleep(2000);
    }

    @And("I click Go to Assessment button")
    public void iClickGoToAssessmentButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Go To Assessment')]")).click();
    }

    @And("I click Submit my Answer button")
    public void iClickSubmitMyAnswerButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Submit My Answers')]")).click();
        Thread.sleep(1000);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ENTER);
        actions.perform();
    }

    @When("I click My Grades button")
    public void iClickMyGradesButton() {
        getDriver().findElement(By.xpath("//h5[contains(text(),'My Grades')]")).click();
    }

    @Then("I should see quiz {string} assignment details on Assignments page")
    public void iShouldSeeQuizAssignmentDetailsOnAssignmentsPage(String quiz) {
        String actual = getDriver().findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-title[3]")).getText().substring(6);
        String dateDetails = getDriver().findElement(By.xpath("//mat-expansion-panel[1]/mat-expansion-panel-header/span/mat-panel-title[1]")).getText().substring(17);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yy");
        Assert.assertEquals(actual, quiz);
        Assert.assertEquals(dateDetails, format.format(date));


    }


    @And("I log out from Teacher account")
    public void iLogOutFromTeacherAccount() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Log Out')]")).click();
        getDriver().switchTo().activeElement().findElement(By.xpath("//button[@aria-label=\"Close dialog\"][2]"));
        Thread.sleep(2000);
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.TAB);
        actions.sendKeys(Keys.ENTER);
        actions.perform();
        Thread.sleep(2000);
    }

    @And("I click Assigments button")
    public void iClickAssigmentsButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//h5[contains(text(),'Assignments')]")).click();
        Thread.sleep(2000);
    }

    @And("I click Create New Assignment button")
    public void iClickCreateNewAssignmentButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Assignment')]")).click();
    }

    @And("I select quiz {string} from 'Select quiz to assgin' drop-down list")
    public void iSelectFromSelectQuizToAssginDropDownList(String quizName) {
        getDriver().findElement(By.xpath("//span[contains(text(),'Select Quiz To Assign')]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(), '"+quizName+"')]")).click();
    }

    @And("I select Student from 'Students list'")
    public void iSelectStudentFromStudentsList() {
        getDriver().findElement(By.xpath("//span[contains(text(),'TEST90')]/parent::div/preceding-sibling::mat-pseudo-checkbox")).click();

    }

    @And("I click Give Assignment button")
     public void iClickGiveAssignmentButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Give Assignment')]")).click();
        Thread.sleep(2000);
    }

    @Then("I should see quiz {string} with Status: {string}")
    public void iShouldSeeQuizGradedAutomaticalyAndStatus(String quizName, String status) {
        String actualStatus = getDriver().findElement(By.xpath(
                "//td[contains(text(),'"+quizName+"')]/following-sibling::td/span")).getText();
        String actualQuizName = getDriver().findElement(By.xpath("//td[contains(text(),'"+quizName+"')]")).getText();
        Assert.assertEquals(actualQuizName, quizName);
        Assert.assertEquals(actualStatus, status);
    }

    @And("I select group code {string} from Group filter drop-down list")
    public void iSelectGroupCodeFromGroupFilterDropDownList(String groupCode) {
        getDriver().findElement(By.xpath("//mat-select[1]/div[1]/div[2]")).click();
        getDriver().findElement(By.xpath("//span[contains(text(),'"+groupCode+"')]/parent::mat-option")).click();
    }

    @And("I click 'Select All' button")
    public void iClickSelectAllButton() {
        getDriver().findElement(By.xpath("//span[contains(text(),'Select All')]")).click();
    }

    @Then("I should see 'Select at least one Student' error message")
    public void iShouldSeeSelectAtLeastOneStudentErrorMessage() {
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//mat-error[contains(text(),'Select at least one Student')]")));
        String errormsg = getDriver().findElement(By.xpath("//mat-error[contains(text(),'Select at least one Student')]")).getText();
        Assert.assertEquals(errormsg, "Select at least one Student");
    }

    @Then("I should see 'This field is required' error message")
    public void iShouldSeeThisFieldIsRequiredErrorMessage() {
        String errormsg = getDriver().findElement(By.xpath("//mat-error[contains(text(),'This field is required')]")).getText();
        Assert.assertEquals(errormsg, "This field is required");
    }

    @And("I type {string} characters in 'Other' text area")
    public void iTypeCharactersInOtherTextArea(String number) {
        int length = Integer.parseInt(number);
        boolean useletters = true;
        boolean usenumbers = false;
        String generatedString = RandomStringUtils.random(length, useletters, usenumbers);
        getDriver().findElement(By.xpath("//textarea")).sendKeys(generatedString);
        System.out.println(generatedString);
    }

    @Then("I should see 'Assignment isn't complete. Check for the errors' error message")
    public void iShouldSeeErrorMessage() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10, 200);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),\"Assignment isn't complete. Check for the errors\")]")));
        String errormsg = getDriver().findElement(By.xpath("//div[contains(text(),\"Assignment isn't complete. Check for the errors\")]")).getText();
        Assert.assertEquals(errormsg, "Assignment isn't complete. Check for the errors");
    }

    @And("I click Quizzes button")
    public void iClickQuizzesButton() throws InterruptedException {
        objects.mainePageTeacher.QuizzesButton().click();
        Thread.sleep(2000);
    }

    @And("I click 'Create New Quiz' button")
    public void iClickCreateNewQuizButton() throws InterruptedException {
        getDriver().findElement(By.xpath("//span[contains(text(),'Create New Quiz')]")).click();
        Thread.sleep(1000);
    }

    @And("I type {string} in Title Of The Quiz field")
    public void iTypeInTitleOfTheQuizField(String quizTitle) {
        objects.QuizzBuilder.TitleOfTheQuizz().sendKeys(quizTitle);
    }

    @And("I click Add Question button {string} times")
    public void iClickAddQuestionButton(String clickNumber) throws InterruptedException {
        int clicks = Integer.parseInt(clickNumber);
        int i = 0;
        while (i<clicks){
            objects.QuizzBuilder.AddQuestionButton().click();
            Thread.sleep(2000);
            i++;
        }


    }

    @And("I select quiz type {string} for question number {int}")
    public void iSelectOptionForQuestionNumber(String option, int qestionNumber) throws InterruptedException {
        //mat-panel-title[contains(text(),'Q1: new empty question')]/ancestor::mat-expansion-panel/div/div/ac-question-body-form/
        //mat-panel-title[contains(text(),'Q1: new empty question')]/ancestor::mat-expansion-panel/div/div/ac-question-body-form/div/div/div/mat-radio-group/mat-radio-button/label/div[1]/div[2]/pr
        switch (option) {
            case "Textual" -> {
                objects.QuizzBuilder.QuizzTypeTextualRadioBtn(qestionNumber).click();
                Thread.sleep(2000);
            }

            case "Single-Choice" -> {
                objects.QuizzBuilder.QuizzTypeSingleChoiceRadioBtn(qestionNumber).click();
                Thread.sleep(2000);
            }
            case "Multiple-Choice" -> {
                objects.QuizzBuilder.QuizzTypeMultipleChoiceRadioBtn(qestionNumber).click();
                Thread.sleep(2000);
            }
            default -> {
                objects.QuizzBuilder.QuizzTypeSingleChoiceRadioBtn(qestionNumber).click();
                Thread.sleep(2000);
            }
        }
    }

    @And("I type {string} in Question field for question number {int}")
    public void iTypeInQuestionFieldForQuestionNumber(String qName, int qnumber) {
        objects.QuizzBuilder.QuestionName(qnumber).sendKeys(qName);
        }

    @And("I select {string} option as correct answer for question number {int}")
    public void iSelectOptionAsCorrectAnswer(String optionNumber, int qnumber) {
        objects.QuizzBuilder.QuestionOptionBtn(qnumber, optionNumber).click();
    }

    @And("I type {string} in Option {string} filed for question number {int}")
    public void iTypeInOptionFiled(String question, String optionNumber, int qnumber) {
        objects.QuizzBuilder.OptionFiled(qnumber, optionNumber).sendKeys(question);
    }

    @And("I switch to question number {int}")
    public void iSwitchToQuestionNumber(int qnumber) {
        objects.QuizzBuilder.Question(qnumber).click();
    }

    @And("I click 'Save' button to save quiz")
    public void iClickSaveButtonToSaveQuiz() throws InterruptedException {
        objects.QuizzBuilder.SaveBtn().click();
        Thread.sleep(2000);
    }

    @Then("I should see quiz with title {string} in 'List of Quizzes'")
    public void iShouldSeeQuizWithTitleInListOfQuizzes(String qname) {
        String quiz = getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'"+qname+"')]")).getText();
        Assert.assertEquals(quiz, qname);
    }

    @Then("I shoulde see 'Quiz is not completed. Check highlighted with 'red' areas' error message")
    public void iShouldeSeeQuizIsNotCompletedCheckHighlightedWithRedAreasErrorMessage() {
        String errormsg = getDriver().findElement(By.xpath("//body/div[2]/div[1]/div[1]/snack-bar-container[1]/simple-snack-bar[1]")).getText();
        Assert.assertEquals(errormsg, "Quiz is not completed. Check highlighted with \"red\" areas\n" +
                "X");
        System.out.println(errormsg);
    }

    @And("I click 'Add Option' button {string} times")
    public void iClickAddOptionButtonTimes(String clicks) throws InterruptedException {
        int optionclick = Integer.parseInt(clicks);
        int i = 0;
        while (i<optionclick){
            objects.QuizzBuilder.AddOptionBtn().click();
            Thread.sleep(1000);
            i++;
        }
    }

    @Then("I should see no more than {string} {string} added")
    public void iShouldSeeNoMoreThanOptionsAdded(String numberOf, String OptionsQuestions) {
        switch (OptionsQuestions) {
            case "Options": {
                int number = Integer.parseInt(numberOf);
                List<WebElement> actulnumber = getDriver().findElements(By.xpath("//textarea[@formcontrolname='option']"));
                System.out.println("Actual number of options is:" + actulnumber.size());
                Assert.assertTrue(actulnumber.size()<=number);
            }
            case "Questions": {
                int number = Integer.parseInt(numberOf);
                List<WebElement> actulnumber = getDriver().findElements(By.xpath("//mat-expansion-panel"));
                System.out.println("Actual number of options is:" + actulnumber.size());
                Assert.assertTrue(actulnumber.size()<=number);
            }
            default:
                System.out.println("Please enter Options or Questions as parameter");
        }
    }

    @And("I check 'Include 'Other'' check-box for question number {int}")
    public void iCheckIncludeCheckBoxForQuestionNumber(int qnumber) {
        objects.QuizzBuilder.IncludeOtherBtn(qnumber).click();
    }

    @And("I click 'Go to Submissions' link")
    public void iClickGoToSubmissionsLink() {
        mainePageTeacher.GoToSubmissionsLink().click();
    }

    @And("I set point per question to {string} for question number {int}")
    public void iSetPointPerQuestionToForQuestionNumber(String points, int qNumber) {
        objects.QuizzBuilder.PointsPerQuestionSlider(qNumber).click();
        Actions actions = new Actions(getDriver());
        switch (points){
            case "1" -> {
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.perform();
            }
            case "2" -> {
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.perform();
            }
            case "3" -> {
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.perform();
            }
            case "4" -> {
                actions.sendKeys(Keys.ARROW_LEFT);
                actions.perform();
            }
            case "6" -> {
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.perform();
            }
            case "7" -> {
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.perform();
            }
            case "8" -> {
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.perform();
            }
            case "9" -> {
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.perform();
            }
            case "10" -> {
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.sendKeys(Keys.ARROW_RIGHT);
                actions.perform();
            }
            default -> {
                actions.sendKeys(Keys.ARROW_RIGHT);
            }
        }
    }

    @And("I wait for {int} seconds")
    public void iWaitForSeconds(int sec) throws InterruptedException {
        Thread.sleep(sec * 1000L);
    }

    @And("I type {string} as an anwser into 'Enter your anwser' field for question number {int}")
    public void iTypeAsAnAnwserIntoEnterYourAnwserFieldForQuestionNumber(String anwser, int questionNumber) {
        objects.AssesmentStudent.textArea(questionNumber).sendKeys(anwser);
    }

    @And("I select radio button number {int} as an anwser for question number {int}")
    public void iSelectRadioButtonNumberAsCorrectAnwserForQuestionNumber(int optionNumber, int questionNumber) {
        objects.AssesmentStudent.radioBtn(optionNumber, questionNumber).click();
    }

    @And("I select check-box number {int} as an anwser for question number {int}")
    public void iSelectCheckBoxNumberAsAnAnwserForQuestionNumber(int optionNumber, int questionNumber) {
        objects.AssesmentStudent.checkBox(questionNumber, optionNumber).click();
    }

    @Then("I should see role as {string}")
    public void iShouldSeeRoleAs(String role) {
        String actualrole = getDriver().findElement(By.xpath("//div[@class='info']/p")).getText();
        Assert.assertEquals(actualrole, role);

    }

    @Then("I should see Log in page")
    public void iShouldSeeLogInPage() {
        String registernow = getDriver().findElement(By.xpath("//span[contains(text(),'Register Now')]")).getText();
        Assert.assertEquals(registernow, "Register Now");
    }
}
