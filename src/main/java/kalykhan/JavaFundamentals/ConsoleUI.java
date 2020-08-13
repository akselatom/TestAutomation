package kalykhan.JavaFundamentals;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleUI {

    /**
     * @return returns the text entered in the console.
     */
    public final String consoleInput() {
        String result = null;
        try {
            Scanner in = new Scanner(System.in);
            String userName = in.nextLine();
            if (!userName.isEmpty()) {
                result = userName;
            }
        } catch (NoSuchElementException ex) {
            System.out.println("Sorry, failed to process that input");
            consoleInput();
        }
        return result;
    }

    /**
     * Ask user name using {@link #consoleInput()} method
     * Then show welcome message.
     */
    public final void helloUser() {
        System.out.println("Could you introduce yourself? ");
        System.out.println("Hello " + consoleInput());
    }
}
