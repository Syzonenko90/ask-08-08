@HomeWork
  Feature: Home work
    @LogInasStudent
    Scenario: Log in as teacher verify role
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Teacher
      Then I should see role as "TEACHER"
      Then I log out from Teacher account


    Scenario: Iog in as student verify role
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Student
      Then I should see role as "STUDENT"
      Then I log out from Teacher account


    Scenario: Log out verify log in page
      Given I open page "http://ask-stage.portnov.com/"
      And I log in as Student
      Then I should see role as "STUDENT"
      And I log out from Teacher account
      Then I should see Log in page