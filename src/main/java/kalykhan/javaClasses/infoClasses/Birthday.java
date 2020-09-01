package kalykhan.javaClasses.infoClasses;

import java.util.Objects;
import java.util.Random;

/**
 * Class containing information about the date of birth.
 */
public class Birthday {
    private Integer day;
    private Integer month;
    private Integer year;

    /**
     * Instantiates a new Birthday with random generated date.
     */
    Birthday() {
        generateRandomDate();
    }

    /**
     * Instantiates a new Birthday with specified value.
     *
     * @param day   the day
     * @param month the month
     * @param year  the year
     */
    public Birthday(Integer day, Integer month, Integer year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birthday birthday = (Birthday) o;
        return Objects.equals(day, birthday.day) &&
                Objects.equals(month, birthday.month) &&
                Objects.equals(year, birthday.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

    @Override
    public String toString() {
        return String.format("%d.%d.%d",
                this.day, this.month, this.year);
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

    /**
     * Generate random value to all Birthday fields.
     */
    private void generateRandomDate() {
        Random random = new Random();
        this.day = random.nextInt(30) + 1;
        this.month = random.nextInt(12) + 1;
        this.year = 1950 + random.nextInt(60);
    }
}
