package kalykhan.javaCollections;

import kalykhan.javaCollections.autoDatabase.AutoDatabase;
import kalykhan.javaCollections.consoleCommands.*;

import java.util.*;

public class UI {
    Dictionary<String,ConsoleCommand> consoleCommands;
    TaxiStation taxiStation;

    public UI(){
        consoleCommands = new Hashtable<>();
        List<ConsoleCommand> commands = Arrays.asList(
                new CommandGetVehicleFasterThanGivenSpeed(),
                new CommandShowPricesOfAllCars(),
                new CommandShowVehicleList(),
                new CommandSortAutoListByFuelConsumption());
        for(ConsoleCommand command : commands) {
            consoleCommands.put(command.commandName, command);
        }
        taxiStation = new TaxiStation(new AutoDatabase("vehicle.xml"));
    }

    public void showListOfAvailableCommands() {
        System.out.print("Available commands: exit ");
        for (Enumeration e = consoleCommands.keys(); e.hasMoreElements();) {
            System.out.print(e.nextElement() + " ");
        }

    }

    public void provideUserInterface() {
        System.out.println("Input command");
        String input = getUserInput();
        while(!input.equals("exit")) {
            if (consoleCommands.get(input) != null) {
                consoleCommands.get(input).execute(taxiStation);
            }else {
                showListOfAvailableCommands();
            }
            input = getUserInput();
        }

    }

    private String getUserInput() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input;
    }
}
