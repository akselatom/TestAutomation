package kalykhan.java.classes.info.classes;

/**
 * Class containing information about full address.
 */
public class Address {
  private String country;
  private String city;
  private String street;
  private String houseNumber;

  public Address() {
    this.country = "Belarus";
    this.city = "Vitebsk";
    this.street = "Cosmonavtov";
    this.houseNumber = "8";
  }

  public Address(String country, String city, String street, String houseNumber) {
    this.country = country;
    this.city = city;
    this.street = street;
    this.houseNumber = houseNumber;
  }

  /**
   * converting object data to string.
   * @return Returns a string containing the entire address.
   */
  @Override
  public String toString() {
    return String.format("{country='%s', city='%s', street='%s', houseNumber='%s'}",
        country, city, street, houseNumber);
  }

  /**
   ** @return Returns an array of strings containing
   * all Address class fields.
   */
  public String[] getAddress() {
    return new String[]{this.country, this.city, this.street, this.houseNumber};
  }
}
