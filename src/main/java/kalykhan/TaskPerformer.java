package kalykhan;

import kalykhan.JavaClasses.Faculty;
import kalykhan.JavaClasses.Student;
import kalykhan.JavaClasses.University;

public class TaskPerformer {
    private University bsu = new University();

    void performJavaClassesTask() {
        String line = "_____________";
        System.out.println("Task 1a : Show list of students of a given faculty.");
        for (Student student : bsu.createStudentListAccordingCondition(t->
                t.getFaculty().getFacultyName() == "Rfe")) {
            System.out.println(student.toString());
        }
        System.out.println(line);

        System.out.println("Task 1b : Show lists of students for each faculty and courses;");

    }
}
