package kalykhan.javaClasses.persons;

import kalykhan.javaClasses.education.Faculty;
import kalykhan.javaClasses.education.StudyGroup;
import kalykhan.javaClasses.infoClasses.Address;
import kalykhan.javaClasses.infoClasses.Birthday;
import kalykhan.javaClasses.infoClasses.FullName;

public class Student extends Person {
    Birthday date;
    Faculty faculty;
    StudyGroup studyGroup;

    public Student() {
        super();
        this.date = new Birthday(1, 1, 1960);
        studyGroup = new StudyGroup();
    }

    public Student(FullName fullName, Address address, String phoneNumber,
                   Faculty faculty, StudyGroup group, Birthday date) {
        super(fullName, address, phoneNumber);
        this.faculty = faculty;
        this.studyGroup = group;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, birthday = '%s'",
                super.toString(), faculty.getFacultyName(),
                studyGroup.toString(), date.toString());
    }

    public static Student[] createObjectArray() {
        return new Student[]{new Student(), new Student()};
    }

    public static Student[] createObjectArray(int size) {
        if (size > 0) {
            Student[] students = new Student[size];
            for (int i = 0; i < students.length; i++) {
                students[i] = new Student();
            }
            return students;
        } else {
            return createObjectArray();
        }
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public Birthday getDate() {
        return date;
    }

    public void setDate(Birthday date) {
        this.date = date;
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

    public void setStudyGroup(StudyGroup studyGroup) {
        this.studyGroup = studyGroup;
    }
}
