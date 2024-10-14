package sprint;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class DayChecker {
    public static String checkDayType (LocalDate Date) {

        DayOfWeek day = Date.getDayOfWeek();
        int intDay = day.getValue();
        String result;

       switch (intDay) {
        case 1, 2, 4, 5: 
            result = "Weekday";
            break;
        case 3:
            result = "Hump Day!";
            break;
        case 6, 7:
            result = "Weekend";
            break;
        default:
            result = "Invalid input";
            break;
       }
       return result;
    }
}
