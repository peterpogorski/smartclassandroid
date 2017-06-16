package smartclass.com.smartclass.demodata;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import smartclass.com.smartclass.models.Classroom;
import smartclass.com.smartclass.models.Quiz;
import smartclass.com.smartclass.models.Student;
import smartclass.com.smartclass.models.StudentGoalHistory;
import smartclass.com.smartclass.models.StudentQuizHistory;
import smartclass.com.smartclass.models.Teacher;

/**
 * Created by kevinT on 2017-06-15.
 */

public class TeacherModeDataManager {

    private static TeacherModeDataManager instance;

    private Teacher currentTeacher;
    private List<Student> students;
    private List<Classroom> classrooms;

    private TeacherModeDataManager() {}

    public static TeacherModeDataManager getInstance() {
        if (instance == null) {
            instance = new TeacherModeDataManager();
        }

        return instance;
    }

    private Teacher getTeacher() {
        if (currentTeacher == null) {
            currentTeacher = new Teacher(null, "Charlie", "Brown", "CBrown", new Date(1984, 8, 12), new ArrayList<Classroom>());
        }

        return currentTeacher;
    }

    public List<Student> getStudentList() {
        if (students == null) {
            createStudentList();
        }

        return students;
    }

    public List<Classroom> getClassrooms() {
        if (classrooms == null) {
            createClassroomsList();
        }

        return classrooms;
    }

    private void createStudentList() {
        students = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            Student student = new Student(null, "John", "Doe", "JohnDoe"+i+1, new Date(2000, 10, 14),
                    (ArrayList<Classroom>) getClassrooms(), new ArrayList<StudentQuizHistory>(), new ArrayList<StudentGoalHistory>());
        }
    }

    private void createClassroomsList() {
        classrooms = new ArrayList<>();
        classrooms.add(0, new Classroom("English", "English class ", "ENG101", 1, "academic",
                TeacherModeDataManager.getInstance().getTeacher(),
                new ArrayList<Student>(),
                new ArrayList<Quiz>()));
        classrooms.add(1, new Classroom("Chemistry", "Chemistry class ", "CHE101", 1, "academic",
                TeacherModeDataManager.getInstance().getTeacher(),
                new ArrayList<Student>(),
                new ArrayList<Quiz>()));
        classrooms.add(2, new Classroom("Biology", "Biology class ", "BIO101", 1, "academic",
                TeacherModeDataManager.getInstance().getTeacher(),
                new ArrayList<Student>(),
                new ArrayList<Quiz>()));
    }
}
