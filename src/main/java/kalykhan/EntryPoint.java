package kalykhan;

import kalykhan.JavaFundamentals.CommandLineArgumentsHandler;
import kalykhan.JavaFundamentals.ConsoleUI;
import kalykhan.JavaFundamentals.NumToMonthProvider;
import kalykhan.JavaFundamentals.OptionalTask1.NumberHandler;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class EntryPoint
{
    public static void main( String[] args ) {
        args = new String[]{"10","20","30"};
        ConsoleUI console = new ConsoleUI();
        CommandLineArgumentsHandler handler = new CommandLineArgumentsHandler();
        console.helloUser();
        for(String arg : args){
            System.out.println(arg);
        }
        handler.reverseArgMethod(args);
        for(String arg : args){
            System.out.println(arg);
        }
        System.out.println(handler.sumArg(args));
        System.out.println(NumToMonthProvider.numberToMonth(0) + " "
                + NumToMonthProvider.numberToMonth(7) + " "
                + NumToMonthProvider.numberToMonth(11));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        System.out.println("Input numbers in console, when done type 'end': ");
        
        boolean endCycle = false;
        while(!endCycle){
            String input = console.consoleInput();
            if(input.equalsIgnoreCase("end")){
                endCycle = true;
                break;
            }
            try{
                Integer addNum = Integer.parseInt(input);
                arrayList.add(addNum);
            }catch (NumberFormatException exception){
                System.out.println("Can't parse this number");
            }
        }
        System.out.println(arrayList.toString());
        NumberHandler numberHandler = new NumberHandler();
        System.out.println(numberHandler.findMinLength(arrayList).toString());
        System.out.println(numberHandler.findMaxLength(arrayList).toString());
        numberHandler.sortArrayByNumLength(arrayList,false);
        System.out.println(arrayList.toString());
        System.out.println(numberHandler.getNumLongerThanAvgLength(arrayList));
        System.out.println(numberHandler.findUniqueNum(arrayList));

    }
}
