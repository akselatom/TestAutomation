package kalykhan.javaCollections.automobiles;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Auto")
public class PassengerCar extends Vehicle {
    private Integer passengersCapacity;

    PassengerCar(){}

    public PassengerCar(String brandName, String modelName, Integer maxSpeed,
                        Double fuelConsumption, Integer vehiclePrice, Integer passengersCapacity) {
        super(brandName, modelName, maxSpeed, fuelConsumption, vehiclePrice);
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public String toString() {
        return String.format("%s passengersCapacity=%d",
                super.toString(), passengersCapacity);
    }

    @XmlElement(name = "capacity")
    public Integer getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(Integer passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }
}
