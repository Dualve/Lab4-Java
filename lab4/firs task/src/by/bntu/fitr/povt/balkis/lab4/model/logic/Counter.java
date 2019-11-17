package by.bntu.fitr.povt.balkis.lab4.model.logic;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Counter {
    public static int countingDays(int day, int month, int year) {

        // Date reading
        GregorianCalendar calendar = new GregorianCalendar();

        int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
        int currentMonth = calendar.get(Calendar.MONTH) + 1;
        int currentYear = calendar.get(Calendar.YEAR);

        // Difference of current date and date of birth
        int xDay = currentDay - day;
        int xMonth = currentMonth - month;
        int xYear = currentYear - year;

        // Number of days lived
        int days = xDay + xMonth * 30 + xYear * 365;

        return days;
    }
}
