package Data;

public class Data {
    private static String string = null;

    public static String emailTeacher () {
        string = "teacher.account@gmail.com";
        return string;
    }
    public static String passwordTeacher () {
        string = "Teacher";
        return string;
    }
    public static String fullNameTeacher (){
        string = "Teacher Syzonenko";
        return string;
    }
    public static String emailStudent () {
        string = "student.account@gmail.com";
        return string;
    }
    public static String passwordStudent () {
        string = "Student";
        return string;
    }
    public static String fullNameStudent () {
        string = "Syzonenko Student Test";
        return string;
    }
    public static String quizzSingleChoiceQuestionPASSED () {
        string = "Test quiz(single-choice: PASSED)";
        return string;
    }
    public static String quizzSingleChoiceQuestionFAILED () {
        string = "Test quiz(single-choice: FAILED)";
        return string;
    }
    public static String quizzMultipleChoiceQuestionPASSED () {
        string = "Test quiz(multiple-choice: PASSED)";
        return string;
    }
    public static String quizzMultipleChoiceQuestionFAILED () {
        string = "Test quiz(multiple-choice: FAILED)";
        return string;
    }
    public static String quizzMultipleSingleChoiceQuestionPASSED () {
        string = "Test quiz(single-choice and multiple-choice questions: PASSED)";
        return string;
    }
    public static String quizzMultipleSingleChoiceQuestionFAILED () {
        string = "Test quiz(single-choice and multiple-choice questions: FAILED)";
        return string;
    }
    public static String quizzTextualQuestionFAILED () {
        string = "Test quiz (textual)";
        return string;
    }
}

