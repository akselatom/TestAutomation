package kalykhan.javaCollections.consoleCommands;

import kalykhan.javaCollections.TaxiStation;

import java.util.Collections;
import java.util.Comparator;

public class CommandSortAutoListByFuelConsumption extends ConsoleCommand {

    public CommandSortAutoListByFuelConsumption() {
        this.commandName = "sortByFuelConsump";
    }

    @Override
    public void execute(TaxiStation taxiStation) {
        taxiStation.sortVehiclesListByFuelConsumption();
    }
}
