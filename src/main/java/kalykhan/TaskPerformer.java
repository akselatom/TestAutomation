package kalykhan;

import kalykhan.javaClasses.education.Faculty;
import kalykhan.javaClasses.persons.Student;
import kalykhan.javaClasses.education.StudyGroup;
import kalykhan.javaClasses.education.University;

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
        for(Faculty faculty : bsu.getFaculties()) {
            for(int i = 1 ; i < faculty.getTrainingDuration() ; i++) {
                int finalI = i;
                System.out.println(faculty.createStudentListAccordingCondition
                        (student -> student.getStudyGroup().getCourse().equals(finalI)));
            }
        }
        System.out.println(line);

        System.out.println("Task 1c : Show lists of students born after a given year;");
        for (Student student : bsu.createStudentListAccordingCondition(t->
                t.getDate().getYear() > 1970)) {
            System.out.println(student.toString());
        }
        System.out.println(line);

        System.out.println("Task 1d : Show lists of study group.");
        for(Faculty faculty : bsu.getFaculties()) {
            System.out.print(faculty.getFacultyName() + ": ");
            System.out.println(faculty.createStudentListAccordingCondition
                    (student -> student.getStudyGroup().equals(new StudyGroup(3,2))));
        }
        System.out.println(line);
    }
}
