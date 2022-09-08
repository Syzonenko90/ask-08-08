@SingleChoiceQuestionOptions
  Feature: Single Choice Question - Options
    @Test1
    Scenario: Options cannot be left blank and should contain min. 1 character
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Quizzes button
      And I click 'Create New Quiz' button
      And I type "Test quiz(Automated)" in Title Of The Quiz field
      And I click Add Question button "1" times
      And I select quiz type "Single-Choice" for question number "1"
      And I type "TestQuiz" in Question field for question number "1"
      And I type "Correct" in Option "1" filed for question number "1"
      And I type "Incorrect" in Option "2" filed for question number "1"
      And I select "1" option as correct answer for question number "1"
      When I click 'Save' button to save quiz
      Then I should see quiz with title "Test quiz(Automated)" in 'List of Quizzes'


    @Test2
    Scenario: Validate the option field is required
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Quizzes button
      And I click 'Create New Quiz' button
      And I type "Test quiz(Automated)" in Title Of The Quiz field
      And I click Add Question button "1" times
      And I select quiz type "Single-Choice" for question number "1"
      And I type "TestQuiz" in Question field for question number "1"
      And I select "1" option as correct answer for question number "1"
      When I click 'Save' button to save quiz
      Then I shoulde see 'Quiz is not completed. Check highlighted with 'red' areas' error message


    @Test3
    Scenario: Validate that single choice question gets graded automatically
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Quizzes button
      And I click 'Create New Quiz' button
      And I type "Test quiz(Automated)" in Title Of The Quiz field
      And I click Add Question button "1" times
      And I select quiz type "Single-Choice" for question number "1"
      And I type "TestQuiz" in Question field for question number "1"
      And I type "Correct" in Option "1" filed for question number "1"
      And I type "Incorrect" in Option "2" filed for question number "1"
      And I select "1" option as correct answer for question number "1"
      And I click 'Save' button to save quiz
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(Automated)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select Correct radio button for Question 1
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(Automated)" graded automaticaly and Status: "PASSED"

    @Test4
    Scenario: Validate that no more than 15 choices can be given as an option for answer
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Quizzes button
      And I click 'Create New Quiz' button
      And I type "Test quiz(Automated)" in Title Of The Quiz field
      And I click Add Question button "1" times
      And I select quiz type "Single-Choice" for question number "1"
      When I click 'Add Option' button '14' times
      Then I should see no more than "15" "Options" added




