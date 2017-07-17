package smartclass.com.smartclass.course.fragments.quizzes.quizCreation;

/**
 * Created by kevinT on 2017-07-16.
 */

public class QuizCreationContract {

    interface Presenter {
        void onCreate();
        boolean createQuiz();
    }

    interface View {
        String getTitleInput();
        String getDescriptionInput();
        String getQuestion();
        String getAnswer1();
        String getAnswer2();
        String getAnswer3();
        String getAnswer4();
        String getAnswer5();
        String getCorrectAnswer();
        boolean highlightEmptyFields();
    }
}