package kalykhan.JavaClasses;

public class Student extends Person {
    Birthday date;
    String faculty;
    Integer course;
    Integer group;

    public Student() {
        super();
        this.date = new Birthday(1,1,1960);
        this.faculty = "Rfe";
        this.course = 4;
        this.group = 1;
    }

    public Student(String firstName, String secondName, String patronymicName,
                   Address address, String phoneNumber,
                   String faculty, Integer course, Integer group,Birthday date) {
        super(firstName, secondName, patronymicName, address, phoneNumber);
        this.faculty = faculty;
        this.course = course;
        this.group = group;
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("%s, faculty='%s', course='%d', group='%d'",
                super.toString(),faculty, course,group);
    }

    public static Student[] createObjectArray() {
        return new Student[]{new Student(), new Student()};
    }

    public static Student[] createObjectArray(int size) {
        if(size > 0) {
            Student[] students = new Student[size];
            for(int i = 0 ; i < students.length ; i++) {
                students[i] = new Student();
            }
            return students;
        } else {
            return createObjectArray();
        }
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Birthday getDate() {
        return date;
    }

    public void setDate(Birthday date) {
        this.date = date;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}
