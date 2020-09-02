package kalykhan.java.classes.info.classes;

import java.util.Random;

public class FullName {
  private String firstName;
  private String secondName;
  private String patronymicName;

  public FullName() {
    generateRandomName();
  }

  public FullName(String firstName, String secondName, String patronymicName) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.patronymicName = patronymicName;
  }

  @Override
  public String toString() {
    return String.format("firstName='%s', secondName='%s', patronymicName='%s'",
        this.firstName, this.secondName, this.patronymicName);
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getSecondName() {
    return this.secondName;
  }

  public String getPatronymicName() {
    return this.patronymicName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setSecondName(String secondName) {
    this.secondName = secondName;
  }

  public void setPatronymicName(String patronymicName) {
    this.patronymicName = patronymicName;
  }

  private void generateRandomName() {
    String[] names = new String[]{"John", "Nick", "Sergey", "Ivan"};
    String[] secondNames = new String[]{"Kalykhan", "Connor", "Ivanovich", "Astley"};
    Random random = new Random();
    this.firstName = names[random.nextInt(names.length)];
    this.secondName = secondNames[random.nextInt(secondNames.length)];
    this.patronymicName = "None";
  }
}
