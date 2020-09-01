package kalykhan.JavaFundamentals;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Random;
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
     * Ask user name using {@link #consoleInput()} method.
     * Then show welcome message.
     */
    public final void helloUser() {
        System.out.println("Could you introduce yourself? ");
        System.out.println("Hello " + consoleInput());
    }

    public void showRandNum(int amount) {
        ArrayList<Integer> randList = new ArrayList<>();
        Random random = new Random();
        for(int i = 0 ; i < amount ; i++) {
            randList.add(random.nextInt(101));
        }
        System.out.println(randList);
        for(Integer num : randList) {
            System.out.println(num);
        }
    }

    public void showArrayElements(String[] strings) {
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    public static Integer performIntParse(String input){
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            return -1;
        }
    }
}
