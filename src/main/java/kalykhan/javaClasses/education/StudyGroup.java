package kalykhan.javaClasses.education;

import java.util.Objects;

public class StudyGroup {
    private Integer course;
    private Integer group;

    public StudyGroup() {
        this.course = 1;
        this.group = 1;
    }

    public StudyGroup(Integer course, Integer group) {
        this.group = group;
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format("Course = '%s',Group = '%s'",
                course.toString(), group.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyGroup that = (StudyGroup) o;
        return Objects.equals(course, that.course) &&
                Objects.equals(group, that.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, group);
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
