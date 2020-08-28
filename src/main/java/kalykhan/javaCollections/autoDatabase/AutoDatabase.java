package kalykhan.javaCollections.autoDatabase;

import kalykhan.javaCollections.automobiles.PassengerCar;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "AutoDatabase")
public class AutoDatabase {
    @XmlElements(@XmlElement(name ="Auto"))
    private List<PassengerCar> vehicleList = new ArrayList<>();

    public AutoDatabase(){
        vehicleList = new ArrayList<>(Arrays.asList(new PassengerCar("Auto","ra",5,5.0,5,5),new PassengerCar("Twest","ra",5,5.0,5,5)));
    }

    public AutoDatabase(String xmlFilename) {
        this.vehicleList = XmlToAutoDatabaseParser
                .parseXmlToObject(xmlFilename)
                .getVehicleList();
    }

    public List<PassengerCar> getVehicleList() {
        return vehicleList;
    }
}
