package kalykhan.java.collections.consoleCommands;

import kalykhan.java.collections.TaxiStation;

public class CommandShowPricesOfAllCars extends ConsoleCommand {
    public CommandShowPricesOfAllCars() {
        this.commandName = "countPrice";
    }
    @Override
    public void executeCommand(TaxiStation taxiStation) {
        System.out.println("Total price: " + taxiStation.getThePriceOfAllVehicles());
    }
}
