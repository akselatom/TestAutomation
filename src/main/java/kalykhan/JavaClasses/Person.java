package kalykhan.JavaClasses;

public class Person {
    private Integer id;
    private String firstName;
    private String secondName;
    private String patronymicName;
    private Address address;
    private String phoneNumber;
    private static Integer objectCounter = 0;

    public Person() {
        objectCounter++;
        this.id = objectCounter;
        this.firstName = "First";
        this.secondName = "Second";
        this.patronymicName = "Test";
        this.address = new Address();
        this.phoneNumber = "+375123456789";
    }

    public Person(String firstName, String secondName,
                  String patronymicName, Address address, String phoneNumber) {
        this();
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymicName = patronymicName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return String.format("%s: id=%d, firstName='%s', secondName='%s', patronymicName='%s', address='%s', phoneNumber='%s'",
                this.getClass().getSimpleName(), id, firstName, secondName, patronymicName, address.toString(), phoneNumber);
    }

    public static Person[] createObjectArray() {
        return new Person[]{new Person(), new Person(), new Person()};
    }

    public static Person[] createObjectArray(int size) {
        if(size > 0) {
            Person[] personArray = new Person[size];
            for(int i = 0 ; i < personArray.length ; i++) {
                personArray[i] = new Person();
            }
            return personArray;
        } else {
            return createObjectArray();}
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

    public Address getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
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

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
