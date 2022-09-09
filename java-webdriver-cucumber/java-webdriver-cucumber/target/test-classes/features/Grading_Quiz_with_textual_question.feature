@GradingQuizWithTextualQuestion
  Feature: Grading - Quiz with textual question
    @Test1
    Scenario: Auto-grade system grades automatically Quiz with textual question: Pending Review
      Given I open page "http://ask-stage.portnov.com/"
      Then I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz (textual)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      Then I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I type "Anwser" as an anwser into 'Enter your anwser' field for question number "1"
      And I select radio button number "1" as an anwser for question number "2"
      And I click Submit my Answer button
      And I click My Grades button
      Then I should see quiz "Test quiz (textual)" with Status: "PENDING"
