package kalykhan.javaCollections.consoleCommands;

import kalykhan.javaCollections.TaxiStation;
import kalykhan.javaCollections.automobiles.Vehicle;

public class CommandShowVehicleList extends ConsoleCommand {
    public CommandShowVehicleList() {
        this.commandName = "showVehicles";
    }

    @Override
    public void execute(TaxiStation taxiStation) {
        for(Vehicle vehicle : taxiStation.getVehiclesList()) {
            System.out.println(vehicle.toString());
        }
    }
}
