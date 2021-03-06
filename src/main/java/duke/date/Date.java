package duke.date;

public class Date {
    int day;
    int month;
    int year;
    int time;
    /**
     * Constructor method of Date.
     */

    public Date(String day, String month, String year, String time) {
        this.day = Integer.parseInt(day);
        this.month = Integer.parseInt(month);
        this.year = Integer.parseInt(year);
        this.time = Integer.parseInt(time);
    }

    /**
     * toString method of Date.
     */

    @Override
    public String toString() {
        return "" + day + "/" + month + "/" + year + " " + time;
    }
}
