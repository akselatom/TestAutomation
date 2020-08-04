package kalykhan.JavaFundamentals;

public abstract class CommandLineArgumentsReverser {
    public static void reverseMethod(String[] original){
        for (int i = 0; i < original.length/2; i++){
            String temp = original[i];
            original[i] = original[original.length - 1 - i];
            original[original.length - 1 - i] = temp;
        }
    }
}
