$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Create_Assignment_Students.feature");
formatter.feature({
  "name": "Create Assignement Students",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CreateAssignementStudents"
    }
  ]
});
formatter.scenario({
  "name": "1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateAssignementStudents"
    },
    {
      "name": "@Quiz_with_multiple-choice_question_graded_automatically:FAILED"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open page \"http://ask-stage.portnov.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iOpen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Teacher",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsTeacher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign Test quiz single-choice and multiple-choice questions: FAILED to Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iAssignQuizToStudentSingleChoiceAndMultipleChoiceQuestions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Assigments button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyAssigmentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Go to Assessment button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickGoToAssessmentButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Incorrect radio button for Question 1",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectIncorrectRadioButtonForQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Incorrect check-box for Question 2",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectIncorrectCheckBoxForQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Submit my Answer button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickSubmitMyAnswerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Grades button",
  "keyword": "When "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyGradesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Quiz single-choice and multiple-choice questions graded automaticaly and Status: FAILED",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iShouldSeeQuizGradedAutomaticalyAndStatus()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateAssignementStudents"
    },
    {
      "name": "@Quiz_with_multiple-choice_question_graded_automatically:PASS"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open page \"http://ask-stage.portnov.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iOpen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Teacher",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsTeacher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign Test quiz single-choice and multiple-choice questions: PASSED to Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iAssignTestQuizSingleChoiceAndMultipleChoicePASSEDQuestionsToStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Assigments button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyAssigmentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Go to Assessment button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickGoToAssessmentButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Correct radio button for Question 1",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectCorrectRadioButtonForQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Correct check-box for Question 2",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectCorrectCheckBoxForQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Submit my Answer button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickSubmitMyAnswerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Grades button",
  "keyword": "When "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyGradesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Quiz single-choice and multiple-choice questions graded automaticaly and Status: PASSED",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iShouldSeeQuizSingleChoiceAndMultipleChoiceQuestionsGradedAutomaticalyAndStatusPASSED()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "3",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateAssignementStudents"
    },
    {
      "name": "@Quiz_with_single-choice_question_graded_automatically:FAILED"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open page \"http://ask-stage.portnov.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iOpen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Teacher",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsTeacher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign Test quiz single-choice question: FAILED to Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iAssignTestQuizSingleChoiceQuestionFAILEDToStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Assigments button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyAssigmentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Go to Assessment button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickGoToAssessmentButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Incorrect radio button for Question 1",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectIncorrectRadioButtonForQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Submit my Answer button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickSubmitMyAnswerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Grades button",
  "keyword": "When "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyGradesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Quiz single-choice questions graded automaticaly and Status: FAILED",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iShouldSeeQuizSingleChoiceQuestionsGradedAutomaticalyAndStatusFAILED()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "4",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateAssignementStudents"
    },
    {
      "name": "@Quiz_with_single-choice_question_graded_automatically:PASSED"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open page \"http://ask-stage.portnov.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iOpen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Teacher",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsTeacher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign Test quiz single-choice question: PASSED to Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iAssignTestQuizSingleChoiceQuestionPASSEDToStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Assigments button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyAssigmentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Go to Assessment button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickGoToAssessmentButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Correct radio button for Question 1",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectCorrectRadioButtonForQuestion()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Submit my Answer button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickSubmitMyAnswerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Grades button",
  "keyword": "When "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyGradesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Quiz single-choice questions graded automaticaly and Status: PASSED",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iShouldSeeQuizSingleChoiceQuestionsGradedAutomaticalyAndStatusPASSED()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "5",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateAssignementStudents"
    },
    {
      "name": "@Quiz_with_multiple-choice_question_graded_automatically:FAILED"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open page \"http://ask-stage.portnov.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iOpen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Teacher",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsTeacher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign Test quiz multiple-choice question: FAILED to Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iAssignTestQuizMultipleChoiceQuestionFAILEDToStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Assigments button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyAssigmentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Go to Assessment button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickGoToAssessmentButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Incorrect check-box for Question 1",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectIncorrectCheckBoxForQuestion1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Submit my Answer button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickSubmitMyAnswerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Grades button",
  "keyword": "When "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyGradesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Quiz multiple-choice question graded automaticaly and Status: FAILED",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iShouldSeeQuizMultipleChoiceQuestionGradedAutomaticalyAndStatusFAILED()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "6",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CreateAssignementStudents"
    },
    {
      "name": "@Quiz_with_multiple-choice_question_graded_automatically:PASSED"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open page \"http://ask-stage.portnov.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iOpen(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Teacher",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsTeacher()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I assign Test quiz multiple-choice question: PASSED to Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iAssignTestQuizMultipleChoiceQuestionPassedoStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I log in as Student",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iLogInAsStudent()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Assigments button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyAssigmentsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Go to Assessment button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickGoToAssessmentButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Correct check-box for Question 1",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iSelectCorrectCheckBoxForQuestion1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Submit my Answer button",
  "keyword": "And "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickSubmitMyAnswerButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click My Grades button",
  "keyword": "When "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iClickMyGradesButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see Quiz multiple-choice question graded automaticaly and Status: PASSED",
  "keyword": "Then "
});
formatter.match({
  "location": "Create_Assignment_Students_StepDefs.iShouldSeeQuizMultipleChoiceQuestionGradedAutomaticalyAndStatusPASSED()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});