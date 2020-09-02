package kalykhan.java.collections.consoleCommands;

import kalykhan.java.collections.TaxiStation;

public abstract class ConsoleCommand {
    public String commandName;

    public abstract void executeCommand(TaxiStation taxiStation);
}
