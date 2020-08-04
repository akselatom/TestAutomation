package kalykhan.JavaFundamentals;

public class NumToMonthProvider{
    enum dict{
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
    };

    public String numberToMonth(int number){
        return dict.values()[number].toString();
    }
}
