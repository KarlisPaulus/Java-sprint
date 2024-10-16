package sprint;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class WeekendCalculator {
    public static long countWeekendDays (LocalDate startDate, LocalDate endDate) {
        long result = 0;
        DayOfWeek days = startDate.getDayOfWeek();
        int dayNum = days.getValue();
        int startDay = startDate.getDayOfYear();
        int endDay = endDate.getDayOfYear();
        int weeks = (endDay - startDay) / 7;    // (278-248)/7 to count weeks
        int times = 0;
        for (int day = dayNum; times <= weeks; day++) {

            if (day == 6) {
                result += 1;
            } else if (day == 7) {
                result += 1;
                day = 1;
                times += 1;
            }
        }
        return result-1;
    }
}
