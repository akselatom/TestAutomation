package kalykhan;

import kalykhan.javaCollections.TaxiStation;
import kalykhan.javaCollections.automobiles.PassengerCar;
import kalykhan.javaCollections.automobiles.Vehicle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

/**
 * Hello world!
 *
 */
public class EntryPoint
{
    public static void main( String[] args )
    {
        TaxiStation diamond = new TaxiStation(Arrays.asList(new PassengerCar("Toyota","Avensis",190,11,7000,5),
                new PassengerCar("Nissan","Primera",160,10,5000,5)));
        System.out.println(diamond.getThePriceOfAllVehicles());
        System.out.println(diamond.getVehiclesList());
        diamond.sortVehiclesListByFuelConsumption();
        System.out.println(diamond.getVehicleListFasterThanGivenSpeed(170));

        System.out.println(diamond.getVehiclesList());
    }
}
