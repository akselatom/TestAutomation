package kalykhan;

import java.util.ArrayList;
import kalykhan.java.classes.education.Faculty;
import kalykhan.java.classes.education.StudyGroup;
import kalykhan.java.classes.education.University;
import kalykhan.java.classes.persons.Student;
import kalykhan.java.fundamentals.CommandLineArgumentsHandler;
import kalykhan.java.fundamentals.ConsoleUI;
import kalykhan.java.fundamentals.NumToMonthProvider;
import kalykhan.java.fundamentals.optional.task1.NumberHandler;


public class TaskPerformer {
  private University bsu = new University();
  private ConsoleUI ui = new ConsoleUI();
  private NumberHandler numberHandler = new NumberHandler();
  
  void performJavaClassesTask() {
    String line = "_____________";
    System.out.println("Task 1a : Show list of students of a given faculty.");
    for (Student student : bsu.createStudentListAccordingCondition(t ->
        t.getFaculty().getFacultyName().equals("Rfe"))) {
      System.out.println(student.toString());
    }
    System.out.println(line);

    System.out.println("Task 1b : Show lists of students for each faculty and courses;");
    for (Faculty faculty : bsu.getFaculties()) {
      for (int i = 1; i < faculty.getTrainingDuration(); i++) {
        int finalI = i;
        System.out.println(faculty.createStudentListAccordingCondition(
            student -> student.getStudyGroup().getCourse().equals(finalI)));
      }
    }
    System.out.println(line);

    System.out.println("Task 1c : Show lists of students born after a given year;");
    for (Student student : bsu.createStudentListAccordingCondition(t ->
        t.getDate().getYear() > 1970)) {
      System.out.println(student.toString());
    }
    System.out.println(line);

    System.out.println("Task 1d : Show lists of study group.");
    for (Faculty faculty : bsu.getFaculties()) {
      System.out.print(faculty.getFacultyName() + ": ");
      System.out.println(faculty.createStudentListAccordingCondition(
          student -> student.getStudyGroup().equals(new StudyGroup(3, 2))));
    }
    System.out.println(line);
  }
  
  public void performJavaFundamentalsTasks() {
    String line = "____________________";
    System.out.println("Task 1: Meet any person in console");
    ui.helloUser();
    System.out.println(line);

    System.out.println("Task 2: Display command arguments in reverse order");
    System.out.println("Using a prepared string instead of command line arguments ");
    String[] preStrings = {"a", "b", "c", "d"};
    ui.showArrayElements(preStrings);
    CommandLineArgumentsHandler handler = new CommandLineArgumentsHandler();
    handler.reverseArgMethod(preStrings);
    ui.showArrayElements(preStrings);
    System.out.println(line);

    System.out.println(
        "Task 3: Print a given number of random numbers with and without a new line");
    String input = ui.consoleInput();
    if (ConsoleUI.performIntParse(input) != -1) {
      ui.showRandNum(ConsoleUI.performIntParse(input));
    } else {
      System.out.println("Can't parse input to int. "
          + "Set number of random numbers to 5");
      ui.showRandNum(5);
    }
    System.out.println(line);

    System.out.println("Task 4: Enter integers as command line arguments,"
        + " \ncalculate their sum and print the result to the console. ");
    System.out.println("Using a prepared string instead of command line arguments ");
    preStrings = new String[]{"12", "21", "23", "42"};
    ui.showArrayElements(preStrings);
    System.out.println("Sum: " + handler.sumArg(preStrings));
    System.out.println(line);

    System.out.println("Task 5: Enter a number from 1 to 12. "
        + "\nOutput to the console the name of the month corresponding to the given date. "
        + "\nCheck the correctness of entering numbers.");
    input = ui.consoleInput();
    System.out.println(NumToMonthProvider.numberToMonth(input));
    System.out.println(line);
  }

  public void performOptionalTask1FromJavaFundamentals() {
    String line = "____________________";
    System.out.println("Optional Task 1.1: Find the shortest and longest number."
        + " Print the found numbers and their length.");
    ArrayList<Integer> integers = numberHandler.fillArrayList();
    System.out.println(integers.toString());
    System.out.println("Max length: " + numberHandler.findMaxLength(integers).toString()
        + "Min length: " + numberHandler.findMinLength(integers).toString());
    System.out.println(line);

    System.out.println("Optional Task 1.2: Print numbers in "
                + "ascending (descending) order of their lengths.");
    numberHandler.sortArrayByNumLength(integers, true);
    System.out.println("Ascending order: " + integers.toString());
    numberHandler.sortArrayByNumLength(integers, false);
    System.out.println("Descending order: " + integers.toString());
    System.out.println(line);

    System.out.println("Optional Task 1.3: Print to the console those numbers "
        + "whose length is less (more) than the average length "
        + "for all numbers, as well as the length.");
    for (Integer num : numberHandler.getNumLongerThanAvgLength(integers)) {
      System.out.println(num + " " + numberHandler.getLengthNum(num));
    }
    System.out.println(line);

    System.out.println("Optional Task 1.7: Find a number containing only distinct digits."
        + " If there are several such numbers, find the first one.");
    System.out.println(numberHandler.findUniqueNum(integers));
    System.out.println(line);
  }
}
