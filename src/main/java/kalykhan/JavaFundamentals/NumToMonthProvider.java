package kalykhan.JavaFundamentals;

/**
 *  Provides the translation of the digital format of the month in verbal.
 */
public abstract class NumToMonthProvider {
    /**
     * The translation of the digital format of the month in verbal.
     */
    enum Dictionary {
        January,
        February,
        March,
        April,
        May,
        June,
        Jule,
        August,
        September,
        October,
        November,
        December
    }

    /**
     * @param number The ordinal of the month.
     * @return Returns the name of the month.
     * Returns null if number not included in the interval [1,12].
     */
    public static String numberToMonth(final int number) {
        String result = null;
        if (number < 13 && number > 0) {
            result = Dictionary.values()[number - 1].toString();
        }
        return result;
    }

    /**
     * Parse string to int then call @see #numberToMonth(int) method.
     **/
    public static String numberToMonth(final String number) {
        if(ConsoleUI.performIntParse(number) == -1){
            System.out.println("Can't parse this string to int");
        }
        return numberToMonth(ConsoleUI.performIntParse(number));
    }
}
