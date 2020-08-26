package kalykhan.javaCollections.automobiles;

public abstract class Vehicle {
    private String brandName;
    private String modelName;
    private Integer maxSpeed;
    private Integer fuelConsumption;
    private Integer vehiclePrice;

    public Vehicle(String brandName, String modelName, Integer maxSpeed,
                   Integer fuelConsumption, Integer vehiclePrice) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.vehiclePrice = vehiclePrice;
    }

    @Override
    public String toString() {
        return String.format("%s {brandName='%s', modelName='%s', maxSpeed=%d, fuelConsumption=%d, vehiclePrice=%d}",
                getClass().getSimpleName(),brandName, modelName, maxSpeed, fuelConsumption, vehiclePrice);
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public Integer getFuelConsumption() {
        return fuelConsumption;
    }

    public Integer getVehiclePrice() {
        return vehiclePrice;
    }
}
