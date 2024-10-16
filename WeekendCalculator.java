package sprint;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class WeekendCalculator {
    public static long countWeekendDays (LocalDate startDate, LocalDate endDate) {
        long result = 0;

        DayOfWeek days = startDate.getDayOfWeek();
        int currentDay = days.getValue();
        int startDay = startDate.getDayOfYear();
        int endDay = endDate.getDayOfYear();
        int totalDays = endDay - startDay;
        for (int day = 0; day <= totalDays; day++) {
            if (currentDay == 6 || currentDay == 7) {
                result += 1;
            }
            currentDay += 1;
            if (currentDay > 7) {
                currentDay = 1;
            } 
        }
        return result;
    }
}
