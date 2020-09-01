package kalykhan.javaClasses.education;

import kalykhan.javaClasses.infoClasses.Address;
import kalykhan.javaClasses.infoClasses.Birthday;
import kalykhan.javaClasses.infoClasses.FullName;
import kalykhan.javaClasses.persons.Student;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Class containing information about the faculty name
 * and information about students at the faculty.
 */
public class Faculty {
    private String facultyName;
    private ArrayList<Student> studentsList;
    private final Integer trainingDuration = 5;

    Faculty() {
        this.facultyName = "Rfe";
        this.studentsList = new ArrayList<>();
        fillStudentsList();
    }

    Faculty(String facultyName) {
        this.facultyName = facultyName;
        this.studentsList = new ArrayList<>();
        fillStudentsList();
    }

    /**
     * @return Returns faculty name and number of students.
     */
    @Override
    public String toString() {
        return String.format("faculty name: '%s', number of students: '%d'",
                this.facultyName, this.studentsList.size());
    }

    public ArrayList<Student> createStudentListAccordingCondition(Predicate<Student> condition) {
        return (ArrayList<Student>) studentsList.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Integer getTrainingDuration() {
        return trainingDuration;
    }

    /**
     * Fill studentsList with unique Student objects.
     */
    private void fillStudentsList() {
        Random random = new Random();
        for(int i = 0; i < 5; i++) {
            studentsList.add(new Student(
                    new FullName(), new Address(), "",
                    this,
                    new StudyGroup(random.nextInt(trainingDuration) + 1,
                            random.nextInt(4) + 1)
                    ,new Birthday()));
        }
    }
}
