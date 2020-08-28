package kalykhan.javaCollections;

import kalykhan.javaCollections.autoDatabase.AutoDatabase;
import kalykhan.javaCollections.automobiles.Vehicle;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class TaxiStation {
    private AutoDatabase database;

    public TaxiStation(AutoDatabase database) {
        this.database = database;
    }

    public Integer getThePriceOfAllVehicles() {
        Integer fullPrice = 0;
        for(Vehicle vehicle : database.getVehicleList()) {
            fullPrice += vehicle.getVehiclePrice();
        }
        return fullPrice;
    }

    public List<? extends Vehicle> getVehicleListFasterThanGivenSpeed(Integer speed){
        return this.database.getVehicleList().stream().filter(t-> t.getMaxSpeed() > speed).collect(Collectors.toList());
    }

    public TaxiStation sortVehiclesListByFuelConsumption() {
        Collections.sort(this.database.getVehicleList(), Comparator.comparingDouble(o -> o.getFuelConsumption()));
        return this;
    }

    public List<? extends Vehicle> getVehiclesList() {
        return database.getVehicleList();
    }

    public AutoDatabase getDatabase() {
        return database;
    }
}
