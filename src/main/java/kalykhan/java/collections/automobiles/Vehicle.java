package kalykhan.java.collections.automobiles;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vehicle")
public abstract class Vehicle {
  private String brandName;
  private String modelName;
  private Integer maxSpeed;
  private Double fuelConsumption;
  private Integer vehiclePrice;

  public Vehicle() { }

  public Vehicle(String brandName, String modelName, Integer maxSpeed,
      Double fuelConsumption, Integer vehiclePrice) {
    this.brandName = brandName;
    this.modelName = modelName;
    this.maxSpeed = maxSpeed;
    this.fuelConsumption = fuelConsumption;
    this.vehiclePrice = vehiclePrice;
  }

  @Override
  public String toString() {
    return String.format("%s: brandName='%s', modelName='%s', maxSpeed=%d,"
            + " fuelConsumption=%f, vehiclePrice=%d",
        getClass().getSimpleName(), brandName, modelName,
        maxSpeed, fuelConsumption, vehiclePrice);
  }

  @XmlElement(name = "brand")
  public String getBrandName() {
    return brandName;
  }

  @XmlElement(name = "model")
  public String getModelName() {
    return modelName;
  }

  @XmlElement(name = "speed")
  public Integer getMaxSpeed() {
    return maxSpeed;
  }

  @XmlElement(name = "fconsumption")
  public Double getFuelConsumption() {
    return fuelConsumption;
  }

  @XmlElement(name = "price")
  public Integer getVehiclePrice() {
    return vehiclePrice;
  }


  public void setBrandName(final String brandName) {
    this.brandName = brandName;
  }

  public void setModelName(final String modelName) {
    this.modelName = modelName;
  }

  public void setMaxSpeed(final Integer maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public void setFuelConsumption(final Double fuelConsumption) {
    this.fuelConsumption = fuelConsumption;
  }

  public void setVehiclePrice(final Integer vehiclePrice) {
    this.vehiclePrice = vehiclePrice;
  }
}
