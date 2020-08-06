package kalykhan.JavaFundamentals;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ConsoleGreetingProgram {

    public void helloUser(){
        System.out.println("Hello "+ askUserName());
    }

    String askUserName(){
        System.out.println("Could you introduce yourself?");
        try{
            Scanner in = new Scanner(System.in);
            String userName = in.nextLine();
            if(!userName.isEmpty()){
                return userName;
            }
        }catch (NoSuchElementException ex){
            System.out.println("Sorry, failed to process this input");
            askUserName();
        }
        return "world";
    }
}
