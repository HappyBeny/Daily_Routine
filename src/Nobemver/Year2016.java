package Nobemver;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Year2016 {
    public static String solution(int a, int b) {

        String answer = "";
        LocalDate startDate = LocalDate.of(2016, 1, 1);
        LocalDate endDate = LocalDate.of(2016, a, b);

        int dayBetween = (int) ChronoUnit.DAYS.between(startDate,endDate);

        switch (dayBetween % 7) {
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }

        return answer;
    }
}
