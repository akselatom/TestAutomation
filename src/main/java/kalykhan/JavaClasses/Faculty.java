package kalykhan.JavaClasses;

public class Faculty {
    String facultyName;

    Faculty() {
        this.facultyName = "Rfe";
    }

    Faculty(String facultyName) {
        this.facultyName = facultyName;
    }


    @Override
    public String toString() {
        return String.format("faculty name: '%s' ",this.facultyName);
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
}
