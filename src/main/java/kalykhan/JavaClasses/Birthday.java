package kalykhan.JavaClasses;

public class Birthday {
    private Integer day;
    private Integer month;
    private Integer year;

    Birthday(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean compareTo(Birthday date) {
        return this.day.equals(date.day)
                && this.month.equals(date.month)
                && this.year.equals(date.year);
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
