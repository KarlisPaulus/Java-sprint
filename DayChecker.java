package sprint;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class DayChecker {
    public static String checkDayType (LocalDate Date) {

        DayOfWeek day = Date.getDayOfWeek();
        int intDay = day.getValue();
        String result;

       switch (intDay) {
        case 1: 
            result = "Weekday";
            break;
        case 2: 
            result = "Weekday";
            break;
        case 4: 
            result = "Weekday";
            break;
        case 5: 
            result = "Weekday";
            break;
        case 3:
            result = "Hump Day!";
            break;
        case 6:
            result = "Weekend";
            break;
        case 7:
            result = "Weekend";
            break;
        default:
            result = "Invalid input";
            break;
       }
       return result;
    }
}
