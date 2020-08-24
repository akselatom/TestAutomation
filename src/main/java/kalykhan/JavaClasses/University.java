package kalykhan.JavaClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class University {
    private ArrayList<Student> students;

    public University() {
        students = new ArrayList<>(
                Arrays.asList(Student.createObjectArray()));
    }

    public ArrayList<Student> createStudentListAccordingCondition(Predicate<Student> condition) {
        return (ArrayList<Student>) students.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
