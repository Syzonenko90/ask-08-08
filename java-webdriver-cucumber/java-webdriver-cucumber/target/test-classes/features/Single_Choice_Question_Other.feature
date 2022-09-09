@SingleChoiceQuestion_Other
  Feature: Single Choice Question - Other
    @Test_1
    Scenario: "Others" text area doesn't accept more than 1000 Characters
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(Other)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select Correct radio button for Question 1
      And I type "1001" characters in 'Other' text area
      When I click Submit my Answer button
      Then I should see 'Assignment isn't complete. Check for the errors' error message

    @Test2
    Scenario: "Others" text area accept Max 1000 Characters
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(Other)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select Correct radio button for Question 1
      And I type "1000" characters in 'Other' text area
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(Other)" graded automaticaly and Status: "PASSED"

    @Test3
    Scenario: "Others" text area accept Min 1 Characters
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      And I click Assigments button
      And I click Create New Assignment button
      And I select quiz "Test quiz(Other)" from 'Select quiz to assgin' drop-down list
      And I select Student from 'Students list'
      And I click Give Assignment button
      And I log out from Teacher account
      And I log in as Student
      And I click My Assigments button
      And I click Go to Assessment button
      And I select Correct radio button for Question 1
      And I type "1" characters in 'Other' text area
      And I click Submit my Answer button
      When I click My Grades button
      Then I should see quiz "Test quiz(Other)" graded automaticaly and Status: "PASSED"

#    @Test4
#    Scenario: Quiz submitted with "Other" answer only
#      And I log in as Teacher
#      And I click Assigments button
#      And I click Create New Assignment button
#      And I select quiz "Test quiz(Other)" from 'Select quiz to assgin' drop-down list
#      And I select Student from 'Students list'
#      And I click Give Assignment button
#      And I log out from Teacher account
#      And I log in as Student
#      And I click My Assigments button
#      And I click Go to Assessment button
#      And I type "5" characters in 'Other' text area
#      And I click Submit my Answer button
#