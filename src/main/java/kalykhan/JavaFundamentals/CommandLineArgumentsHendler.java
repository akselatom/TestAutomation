package kalykhan.JavaFundamentals;

public class CommandLineArgumentsHendler {

    public static void reverseArgMethod(String[] original) {
        for (int i = 0; i < original.length / 2; i++) {
            String temp = original[i];
            original[i] = original[original.length - 1 - i];
            original[original.length - 1 - i] = temp;
        }
    }

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
