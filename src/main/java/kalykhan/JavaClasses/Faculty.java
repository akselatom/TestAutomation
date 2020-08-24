package kalykhan.JavaClasses;

import java.util.ArrayList;
import java.util.Random;

public class Faculty {
    String facultyName;

    ArrayList<Student> studentsList;

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

    @Override
    public String toString() {
        return String.format("faculty name: '%s' ",this.facultyName);
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

    private void fillStudentsList() {
        Random random = new Random();
        for(int i = 0; i < 3; i++) {
            studentsList.add(new Student(
                    new FullName(), new Address(), "",
                    this,random.nextInt(4) + 1,
                    random.nextInt(4) + 1,new Birthday()));
        }
    }
}
