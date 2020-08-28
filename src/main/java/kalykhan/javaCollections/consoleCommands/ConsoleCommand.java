package kalykhan.javaCollections.consoleCommands;

import kalykhan.javaCollections.TaxiStation;

public abstract class ConsoleCommand {
    public String commandName;

    public abstract void execute(TaxiStation taxiStation);
}
