package kalykhan.JavaFundamentals;

public class CommandLineArgumentsHandler {

    /**
     * Reverse string array.
     * @param args Input array
     */
    public void reverseArgMethod(String[] args) {
        for (int i = 0; i < args.length / 2; i++) {
            String temp = args[i];
            args[i] = args[args.length - 1 - i];
            args[args.length - 1 - i] = temp;
        }
    }

    /**
     * @param args array for summing.
     * @return Returns sum of command line arguments. If failed returns -1.
     */
    public int sumArg(String[] args){
        int sum = 0;
        try{
            for(String arg : args){
                sum += Integer.parseInt(arg);
            }
            return sum;
        }catch (NumberFormatException ex){
            System.out.println("Unable sum command line arguments");
        }
        return -1; // error code
    }
}
