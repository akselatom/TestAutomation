package kalykhan.JavaFundamentals;

public class CalculateCommandLineArgumentsProgram {
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
