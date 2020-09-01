package kalykhan.javaClasses.persons;

import kalykhan.javaClasses.infoClasses.Address;
import kalykhan.javaClasses.infoClasses.FullName;

public class Person {
    private Integer id;
    private FullName fullName;
    private Address address;
    private String phoneNumber;
    private static Integer objectCounter = 0;

    public Person() {
        objectCounter++;
        this.id = objectCounter;
        this.fullName = new FullName();
        this.address = new Address();
        this.phoneNumber = "+375123456789";
    }

    public Person(FullName fullName, Address address, String phoneNumber) {
        this();
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    /*
     * @return Returns a string containing
     * all information about the fields of the object
     */
    public String toString() {
        return String.format("%s: %s, id=%d, address='%s', phoneNumber='%s'",
                this.getClass().getSimpleName(),fullName.toString(),
                id, address.toString(), phoneNumber);
    }

    public static Person[] createObjectArray() {
        return new Person[]{new Person(), new Person(), new Person()};
    }

    public static Person[] createObjectArray(int size) {
        if (size > 0) {
            Person[] personArray = new Person[size];
            for (int i = 0; i < personArray.length; i++) {
                personArray[i] = new Person();
            }
            return personArray;
        } else {
            return createObjectArray();
        }
    }

    public Address getAddress() {
        return this.address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
