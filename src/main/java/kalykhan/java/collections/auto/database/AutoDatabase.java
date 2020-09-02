package kalykhan.java.collections.auto.database;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import kalykhan.java.collections.automobiles.PassengerCar;


@XmlRootElement(name = "AutoDatabase")
public class AutoDatabase {
  @XmlElements(@XmlElement(name = "Auto"))
  private List<PassengerCar> vehicleList = new ArrayList<>();

  public AutoDatabase() { }

  public AutoDatabase(final String xmlFilename) {
    this.vehicleList = XmlToAutoDatabaseParser
        .parseXmlToAutoDatabaseObject(xmlFilename)
        .getVehicleList();
  }

  public List<PassengerCar> getVehicleList() {
    return vehicleList;
  }
}
