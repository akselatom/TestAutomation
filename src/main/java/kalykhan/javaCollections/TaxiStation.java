package kalykhan.javaCollections;

import kalykhan.javaCollections.automobiles.Vehicle;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaxiStation {
    private List<? extends Vehicle> vehiclesList;

    public TaxiStation(List<? extends Vehicle> vehiclesList) {
        this.vehiclesList = vehiclesList;
    }

    public Integer getThePriceOfAllVehicles() {
        Integer fullPrice = 0;
        for(Vehicle vehicle : vehiclesList) {
            fullPrice += vehicle.getVehiclePrice();
        }
        return fullPrice;
    }

    public List<? extends Vehicle> getVehicleListFasterThanGivenSpeed(Integer speed){
        return this.vehiclesList.stream().filter(t-> t.getMaxSpeed() > speed).collect(Collectors.toList());
    }

    public TaxiStation sortVehiclesListByFuelConsumption() {
        Collections.sort(this.vehiclesList, Comparator.comparingInt(o -> o.getFuelConsumption()));
        return this;
    }

    public List<? extends Vehicle> getVehiclesList() {
        return vehiclesList;
    }
}
