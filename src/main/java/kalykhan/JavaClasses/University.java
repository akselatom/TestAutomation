package kalykhan.JavaClasses;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class University {
    private ArrayList<Faculty> faculties;
    private ArrayList<Student> studentsList;

    public University() {
        faculties = new ArrayList<>();
        studentsList = new ArrayList<>();
        fillFacultiesList();
        for(Faculty faculty : faculties) {
            studentsList.addAll(faculty.studentsList);
        }
    }

    public ArrayList<Student> createStudentListAccordingCondition(Predicate<Student> condition) {
        return (ArrayList<Student>) studentsList.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }

    public ArrayList<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(ArrayList<Faculty> faculties) {
        this.faculties = faculties;
    }

    public ArrayList<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(ArrayList<Student> studentsList) {
        this.studentsList = studentsList;
    }

    private void fillFacultiesList() {
        for(String name : new String[]{"Rfe","Mil","Inf"}) {
            faculties.add(new Faculty(name));
        }
    }

}
