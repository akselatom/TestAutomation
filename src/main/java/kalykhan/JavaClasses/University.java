package kalykhan.JavaClasses;

import java.util.ArrayList;

public class University {
    private Student[] students;

    University(){
        students = Student.createArray();
    }

    public Student[] createStudentArrayFromSameFaculty(String facultyName) {
        ArrayList<Student> studentsList = new ArrayList<>();
        for(Student student : this.students) {
            if (facultyName == student.faculty) {
                studentsList.add(student);
            }
        }
        return studentsList.toArray(new Student[0]);
    }

    public Student[] createStudentArrayThatBurnAfterCertainYear(Integer year) {
        ArrayList<Student> studentsList = new ArrayList<>();
        for(Student student : this.students) {
            if (year == student.date.year) {
                studentsList.add(student);
            }
        }
        return studentsList.toArray(new Student[0]);
    }

    public Student[] createGroupList(Integer group, Integer course) {
        ArrayList<Student> studentsList = new ArrayList<>();
        for(Student student : this.students) {
            if (group == student.group && course == student.course) {
                studentsList.add(student);
            }
        }
        return studentsList.toArray(new Student[0]);
    }
}
