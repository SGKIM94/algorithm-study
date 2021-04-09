package algorithm.leetcode.problems;

import java.util.HashMap;

/**
 * leetcode
 * DayOfYear
 * level : easy
 * https://leetcode.com/problems/day-of-the-year/
 */
public class DayOfYear {
    private HashMap<Integer, Integer> mapMonthToDay =
            new HashMap<>() {{
                put(1, 31);
                put(2, 28);
                put(3, 31);
                put(4, 30);
                put(5, 31);
                put(6, 30);
                put(7, 31);
                put(8, 31);
                put(9, 30);
                put(10, 31);
                put(11, 30);
                put(12, 31);
            }};

    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int dayOfYear = 0;

        if (month == 1)  {
            return day;
        } else if(month == 2) {
            return mapMonthToDay.get(1) + day;
        }

        for (int i = 1; i < month; i++) {
            dayOfYear += mapMonthToDay.get(i);
        }

        dayOfYear += day;

        return isLeapYear(year) ? ++dayOfYear : dayOfYear;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
