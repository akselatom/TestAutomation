package kalykhan.javaCollections.consoleCommands;

import kalykhan.javaCollections.TaxiStation;

import java.util.Scanner;

public class CommandGetVehicleFasterThanGivenSpeed extends ConsoleCommand {

    public CommandGetVehicleFasterThanGivenSpeed() {
        this.commandName = "showFasterThan";
    }

    @Override
    public void execute(TaxiStation taxiStation) {
        try {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            taxiStation.getVehicleListFasterThanGivenSpeed(Integer.parseInt(input));
        } catch (NumberFormatException ex) {
            System.out.println("Can't parse this value to integer.");
        }
    }
}
