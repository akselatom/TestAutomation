package kalykhan.java.collections.consoleCommands;

import kalykhan.java.collections.TaxiStation;
import kalykhan.java.collections.automobiles.Vehicle;

public class CommandShowVehicleList extends ConsoleCommand {
    public CommandShowVehicleList() {
        this.commandName = "showVehicles";
    }

    @Override
    public void executeCommand(TaxiStation taxiStation) {
        for(Vehicle vehicle : taxiStation.getVehiclesList()) {
            System.out.println(vehicle.toString());
        }
    }
}
