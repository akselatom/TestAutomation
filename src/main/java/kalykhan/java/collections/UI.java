package kalykhan.java.collections;

import java.util.Arrays;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import kalykhan.java.collections.auto.database.AutoDatabase;
import kalykhan.java.collections.consoleCommands.CommandGetVehicleFasterThanGivenSpeed;
import kalykhan.java.collections.consoleCommands.CommandShowPricesOfAllCars;
import kalykhan.java.collections.consoleCommands.CommandShowVehicleList;
import kalykhan.java.collections.consoleCommands.CommandSortAutoListByFuelConsumption;
import kalykhan.java.collections.consoleCommands.ConsoleCommand;



public class UI {
  Dictionary<String, ConsoleCommand> consoleCommands;
  TaxiStation taxiStation;

  public UI() {
    consoleCommands = new Hashtable<>();
    List<ConsoleCommand> commands = Arrays.asList(
        new CommandGetVehicleFasterThanGivenSpeed(),
        new CommandShowPricesOfAllCars(),
        new CommandShowVehicleList(),
        new CommandSortAutoListByFuelConsumption());
    for (ConsoleCommand command : commands) {
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
    while (!input.equals("exit")) {
      if (consoleCommands.get(input) != null) {
        consoleCommands.get(input).executeCommand(taxiStation);
      } else {
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
