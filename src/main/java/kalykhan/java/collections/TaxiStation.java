package kalykhan.java.collections;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import kalykhan.java.collections.auto.database.AutoDatabase;
import kalykhan.java.collections.automobiles.Vehicle;


public class TaxiStation {
  private AutoDatabase database;

  public TaxiStation(AutoDatabase database) {
    this.database = database;
  }

  public Integer getThePriceOfAllVehicles() {
    Integer fullPrice = 0;
    for (Vehicle vehicle : database.getVehicleList()) {
      fullPrice += vehicle.getVehiclePrice();
    }

    return fullPrice;
  }

  public List<? extends Vehicle> getVehicleListFasterThanGivenSpeed(Integer speed) {
    return this.database.getVehicleList().stream()
        .filter(t -> t.getMaxSpeed() > speed).collect(Collectors.toList());
  }

  public TaxiStation sortVehiclesListByFuelConsumption() {
    this.database.getVehicleList().sort(Comparator.comparingDouble(o -> o.getFuelConsumption()));
    return this;
  }

  public List<? extends Vehicle> getVehiclesList() {
    return database.getVehicleList();
  }

  public AutoDatabase getDatabase() {
    return database;
  }
}
