package kalykhan.javaCollections.consoleCommands;

import kalykhan.javaCollections.TaxiStation;

public class CommandShowPricesOfAllCars extends ConsoleCommand {
    public CommandShowPricesOfAllCars() {
        this.commandName = "countPrice";
    }
    @Override
    public void execute(TaxiStation taxiStation) {
        System.out.println("Total price: " + taxiStation.getThePriceOfAllVehicles());
    }
}
