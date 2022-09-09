@GradingQuizWithNoTextualQuestion
  Feature: Grading_Quiz_with_no_textual_question
    @Quiz_with_multiple-choice_question_graded_automatically:FAILED
    Scenario: 1
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(single-choice and multiple-choice questions: FAILED)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select radio button number 2 as an anwser for question number 1
      And I select check-box number 2 as an anwser for question number 2
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(single-choice and multiple-choice questions: FAILED)" with Status: "FAILED"

    @Quiz_with_multiple-choice_question_graded_automatically:PASS
      Scenario: 2
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(single-choice and multiple-choice questions: PASSED)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select radio button number 1 as an anwser for question number 1
      And I select check-box number 1 as an anwser for question number 2
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(single-choice and multiple-choice questions: PASSED)" with Status: "PASSED"

    @Quiz_with_single-choice_question_graded_automatically:FAILED
      Scenario: 3
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(single-choice: FAILED)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select radio button number 2 as an anwser for question number 1
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(single-choice: FAILED)" with Status: "FAILED"

    @Quiz_with_single-choice_question_graded_automatically:PASSED
    Scenario: 4
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(single-choice: PASSED)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select radio button number 1 as an anwser for question number 1
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(single-choice: PASSED)" with Status: "PASSED"

    @Quiz_with_multiple-choice_question_graded_automatically:FAILED
    Scenario: 5
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(multiple-choice: FAILED)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select check-box number 2 as an anwser for question number 1
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(multiple-choice: FAILED)" with Status: "FAILED"

    @Quiz_with_multiple-choice_question_graded_automatically:PASSED
    Scenario: 6
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(multiple-choice: PASSED)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select check-box number 1 as an anwser for question number 1
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(multiple-choice: PASSED)" with Status: "PASSED"