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
    private ArrayList<Student> students;
    private ArrayList<Classroom> classrooms;

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

    public ArrayList<Student> getStudentList() {
        if (students == null) {
            createStudentList();
        }

        return students;
    }

    public ArrayList<Classroom> getClassrooms() {
        if (classrooms == null) {
            createClassroomsList();
        }

        return classrooms;
    }

    private void createStudentList() {
        students = new ArrayList<>();
        Student student1 = new Student(null, "John", "Doe", "JohnDoe", new Date(2000, 10, 14),
                getClassrooms(), new ArrayList<StudentQuizHistory>(), new ArrayList<StudentGoalHistory>());
        Student student2 = new Student(null, "Bob", "Bee", "BobBee", new Date(2000, 5, 4),
                getClassrooms(), new ArrayList<StudentQuizHistory>(), new ArrayList<StudentGoalHistory>());
        Student student3 = new Student(null, "Alice", "Apple", "AliceApple", new Date(2000, 5, 3),
                getClassrooms(), new ArrayList<StudentQuizHistory>(), new ArrayList<StudentGoalHistory>());
        students.add(0, student1);
        students.add(1, student2);
        students.add(2, student3);
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