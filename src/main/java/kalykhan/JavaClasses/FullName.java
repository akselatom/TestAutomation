package kalykhan.JavaClasses;

public class FullName {
    private String firstName;
    private String secondName;
    private String patronymicName;

    public FullName() {
        this.firstName = "Default";
        this.secondName = "Default";
        this.patronymicName = "Default";
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

    public Boolean compareTo(FullName fullName) {
        return fullName.patronymicName.equals(this.patronymicName)
                && fullName.secondName.equals(this.secondName)
                && fullName.firstName.equals(this.firstName);
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
}
