@CreateAssignment_Students
  Feature: Create Assignment: Students
    
  @TeacherCanAssignQuizForStudentsIndividually
  Scenario: Teacher can assign quiz for students individually
    Given I open page "http://ask-stage.portnov.com/"
    And I log in as Teacher
    Then I should see role as "TEACHER"
    And I click Assigments button
    And I click Create New Assignment button
    And I select quiz "Test quiz" from 'Select quiz to assgin' drop-down list
    And I select Student from 'Students list'
    And I click Give Assignment button
    Then I should see quiz "Test quiz" assignment details on Assignments page

  @TeacherCanAssignQuizForStudentsSearchingByGroupCode
  Scenario: Teacher can assign quiz for students searching by group code
    Given I open page "http://ask-stage.portnov.com/"
    And I log in as Teacher
    And I click Assigments button
    And I click Create New Assignment button
    And I select quiz "Test quiz(single-choice: FAILED)" from 'Select quiz to assgin' drop-down list
    And I select group code "TEST90" from Group filter drop-down list
    And I select Student from 'Students list'
    And I click Give Assignment button
    Then I should see quiz "Test quiz(single-choice: FAILED)" assignment details on Assignments page

  @TeacherCanAssignQuizToAllStudents
  Scenario: Teacher can assign quiz to all students
    Given I open page "http://ask-stage.portnov.com/"
    And I log in as Teacher
    And I click Assigments button
    And I click Create New Assignment button
    And I select quiz "Test quiz(single-choice: PASSED)" from 'Select quiz to assgin' drop-down list
    And I click 'Select All' button
    And I click Give Assignment button
    Then I should see quiz "Test quiz(single-choice: PASSED)" assignment details on Assignments page

  @TeacherCanNOTAssignQuizIfStudentIsNotSelected
  Scenario: Teacher can NOT assign quiz if student is not selected
    Given I open page "http://ask-stage.portnov.com/"
    And I log in as Teacher
    And I click Assigments button
    And I click Create New Assignment button
    And I select quiz "Test quiz(single-choice: PASSED)" from 'Select quiz to assgin' drop-down list
    And I click Give Assignment button
    Then I should see 'Select at least one Student' error message

  @TeacherCanNOTAssignQuizIfQuizIsNotSelected
  Scenario: Teacher can NOT assign quiz if quiz is not selected
    Given I open page "http://ask-stage.portnov.com/"
    And I log in as Teacher
    And I click Assigments button
    And I click Create New Assignment button
    And I select Student from 'Students list'
    And I click Give Assignment button
    Then I should see 'This field is required' error message

  @Test
  Scenario: Some test
    Given I open page "http://ask-stage.portnov.com/"
    And I log in as Teacher
    And I click 'Go to Submissions' link
