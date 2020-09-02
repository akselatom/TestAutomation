package kalykhan.java.collections.consoleCommands;

import kalykhan.java.collections.TaxiStation;


public class CommandSortAutoListByFuelConsumption extends ConsoleCommand {

    public CommandSortAutoListByFuelConsumption() {
        this.commandName = "sortByFuelConsump";
    }

    @Override
    public void executeCommand(TaxiStation taxiStation) {
        taxiStation.sortVehiclesListByFuelConsumption();
    }
}
