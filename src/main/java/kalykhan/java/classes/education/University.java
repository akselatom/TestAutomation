package kalykhan.java.classes.education;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import kalykhan.java.classes.persons.Student;



public class University {
  private ArrayList<Faculty> faculties;

  public University() {
    faculties = new ArrayList<>();
    fillFacultiesList();
  }

  public ArrayList<Student> createStudentListAccordingCondition(Predicate<Student> condition) {
    ArrayList<Student> students = new ArrayList<>();
    for (Faculty faculty : faculties) {
      students.addAll(faculty.getStudentsList().stream()
          .filter(condition)
          .collect(Collectors.toList()));
    }
    return students;
  }

  public ArrayList<Faculty> getFaculties() {
    return faculties;
  }

  public void setFaculties(ArrayList<Faculty> faculties) {
    this.faculties = faculties;
  }

  private void fillFacultiesList() {
    for (String name : new String[]{"Rfe", "Mil", "Inf"}) {
      faculties.add(new Faculty(name));
    }
  }

}
