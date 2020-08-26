package kalykhan.javaCollections.automobiles;

public class PassengerCar extends Vehicle {
    private Integer passengersCapacity;

    public PassengerCar(String brandName, String modelName, Integer maxSpeed,
                        Integer fuelConsumption, Integer vehiclePrice, Integer passengersCapacity) {
        super(brandName, modelName, maxSpeed, fuelConsumption, vehiclePrice);
        this.passengersCapacity = passengersCapacity;
    }

    @Override
    public String toString() {
        return String.format("%s PassengerCar{passengersCapacity=%d}",
                super.toString(), passengersCapacity);
    }

    public Integer getPassengersCapacity() {
        return passengersCapacity;
    }
}
