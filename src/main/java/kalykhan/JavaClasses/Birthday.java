package kalykhan.JavaClasses;

public class Birthday{
    Integer day;
    Integer month;
    Integer year;

    Birthday(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean compareTo(Birthday date) {
        return this.day == date.day
                && this.month == date.month
                && this.year == date.year;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }
}
