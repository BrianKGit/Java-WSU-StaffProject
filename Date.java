/**
 * @author Brian Klein
 * Date: 9/11/17
 * Program: Date.java
 * Description: User-defined class to store the month, day, and year of a 
 *              particular date.
 */
public class Date {
    private int month;
    private int day;
    private int year;

    public Date() {
    }

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return month + "/" + day + "/" + year;
    }
   
   

}
